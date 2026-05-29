# Socrates Simulator

Socrates Simulator is a Spring Boot 3 / Kotlin application that acts as a stub server for the Wigo4it LO (Levensonderhoud) koppelvlak. It receives, validates, and simulates responses for API calls based on the OpenAPI 3.0 specification `oas-wigo4it-koppelvak-lo-2026.030.json`.

## Features

- **OpenAPI-driven models**: All models and API interfaces are derived directly from the Wigo4it LO spec.
- **BSN elfproef validation**: Custom `@ValidBsn` constraint enforces the Dutch 11-test (elfproef) checksum on all `burgerservicenummer` fields.
- **Full schema validation**: All field-level constraints from the spec are enforced — patterns, min/max lengths, numeric ranges, and collection sizes.
- **Structured error responses**: Validation errors (422) and malformed JSON (422) return a `ResponseLOBehandeld` body with `foutcode`, `foutomschrijving`, and a `fouten` list.
- **Global exception handling**: All unhandled errors return a consistent 500 `ResponseLOBehandeld` body instead of Spring's default error format.
- **BSN-based test simulation**: Reserved test BSNs trigger specific HTTP responses — see [BSN Simulation](#bsn-simulation).
- **Swagger UI**: Interactive API documentation available at `/swagger-ui.html`.
- **Docker support**: Ships with a `Dockerfile` and `docker-compose.yml` for containerised deployment.

## Project Structure

```
src/main/kotlin/com/socratessimulator/
├── api/                  API interface (LOBehandeldApi)
├── config/               OpenAPI/Swagger configuration
├── controller/           LOBehandeldController — thin endpoint, delegates to service
├── exception/            GlobalExceptionHandler — 422 and 500 responses
├── model/                Data models for the full ZaakLOBehandeld structure
├── service/              BsnSimulationService — test BSN routing logic
└── validation/           @ValidBsn annotation + BsnValidator (elfproef)
```

## Endpoint

### `POST /api/v{version}/LOBehandeld`

Accepts a `ZaakLOBehandeld` payload and returns a `ResponseLOBehandeld`.

**Request body:**
```json
{
    "identificatie": "Z-123",
    "loBehandeld": {
        "aanvraagdatum": "2023-01-01",
        "aanvraagid": "550e8400-e29b-41d4-a716-446655440000",
        "codeOntvangendeGemeente": "0307",
        "huishouding": {
            "aanvrager": {
                "burgerservicenummer": "123456782",
                "geboortedatum": "1980-01-01",
                "geslachtsaanduiding": "1",
                "geslachtsnaamstam": "Jansen",
                "voorlettersAanschrijving": "J.",
                "naamgebruik": "1",
                "codeBrpGegevensGeheim": "0",
                "nationaliteit": ["0"]
            },
            "leefsituatie": "3"
        },
        "ingangBijstandsuitkering": {
            "datumMeldingBijGemeente": "2023-01-01",
            "datumIngang": "2023-01-01"
        },
        "redenAanvraagLevensonderhoud": {
            "onvoldoendeInkomen": "1"
        }
    }
}
```

**Success response (200 OK):**
```json
{
    "berichtId": "Z-123",
    "responseId": "a3f1c2d4-...",
    "timestamp": "2026-05-29T10:00:00.000+02:00"
}
```

**Validation error response (422 Unprocessable Entity):**
```json
{
    "berichtId": null,
    "responseId": "b7e2d1a0-...",
    "timestamp": "2026-05-29T10:00:00.000+02:00",
    "foutcode": "VALIDATION_ERROR",
    "foutomschrijving": "Validation failed for the request body",
    "fouten": [
        "loBehandeld.huishouding.aanvrager.burgerservicenummer: must be a valid BSN (9 digits, passes elfproef)"
    ]
}
```

## BSN Simulation

The simulator uses the `burgerservicenummer` of the `aanvrager` to route requests to a pre-configured response. This allows consumers to test specific HTTP error scenarios without modifying any request fields other than the BSN.

All test BSNs pass the elfproef checksum and are in the `999999xxx` range reserved for test purposes.

| BSN | HTTP status | Foutcode | Description |
|-----|-------------|----------|-------------|
| `999999400` | `400 Bad Request` | `TEST_400` | Simulated 400 Bad Request |
| `999999424` | `422 Unprocessable Entity` | `TEST_422` | Simulated Elfproef / BSN-error |
| `999999503` | `500 Internal Server Error` | `TEST_500` | Simulated 500 Internal Server Error |
| any other valid BSN | `200 OK` | — | Normal success response |

**Example — trigger a 422:**
```json
{
    "identificatie": "Z-999",
    "loBehandeld": {
        ...
        "huishouding": {
            "aanvrager": {
                "burgerservicenummer": "999999424",
                ...
            }
        }
    }
}
```

**Response:**
```json
{
    "berichtId": "Z-999",
    "responseId": "c9d3e4f5-...",
    "timestamp": "2026-05-29T10:00:00.000+02:00",
    "foutcode": "TEST_422",
    "foutomschrijving": "Simulated Elfproef / BSN-error"
}
```

## Running the Application

### Locally with Gradle

Requires Java 21+.

```bash
./gradlew bootRun
```

The application starts on port `5030`.

### With Docker Compose

```bash
docker compose up --build
```

The application is available at `http://localhost:5030`.

## API Documentation

Swagger UI is available at:

```
http://localhost:5030/swagger-ui.html
```

## Tech Stack

| Component | Version |
|-----------|---------|
| Spring Boot | 3.4.3 |
| Kotlin | 2.1.10 |
| Java | 21 |
| springdoc-openapi | 2.7.0 |
| Hibernate Validator | via `spring-boot-starter-validation` |