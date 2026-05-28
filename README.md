# Socrates Simulator

Socrates Simulator is a Spring Boot application built with Kotlin that serves as an API client/simulator for the Wigo4it LO (Levensonderhoud) interface. It is designed to receive, validate, and process API calls based on the OpenAPI 3.0 specification.

## Features

- **OpenAPI Integration**: Models and API interfaces are derived from the `oas-wigo4it-koppelvak-lo-2026.030.json` specification.
- **Robust Validation**: Uses `jakarta.validation` to ensure incoming requests adhere to strict schema requirements (BSN formats, date patterns, etc.).
- **Global Error Handling**: Provides detailed feedback for validation errors and malformed JSON, returning a structured list of issues.
- **Docker Support**: Ready for containerized deployment with Docker and Docker Compose.
- **SpringDoc OpenAPI**: Interactive Swagger UI available for exploring the API.

## Project Structure

- `src/main/kotlin/com/socratessimulator/api`: Contains API interfaces (`LOBehandeldApi`) and utility classes.
- `src/main/kotlin/com/socratessimulator/controller`: Implementation of the API endpoints (`LOBehandeldController`).
- `src/main/kotlin/com/socratessimulator/model`: Data models representing the complex `ZaakLOBehandeld` structure.
- `src/main/kotlin/com/socratessimulator/exception`: Global exception handler for structured error responses.
- `src/main/resources/api-spec`: The source OpenAPI specification file.

## Example Use Case

### Receiving a 'LO Behandeld' Request

You can send a `POST` request to the simulator to verify how it handles a specific payload.

**Endpoint:** `POST /api/v1/LOBehandeld`

**Sample Payload:**
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

**Success Response (202 Accepted):**
```json
{
    "berichtId": "Z-123",
    "responseId": "550e8400-e29b-41d4-a716-446655440000",
    "timestamp": "2026-05-28T09:36:00.000Z"
}
```

## How to Run It

### Locally with Gradle

Ensure you have Java 21+ installed.

```bash
./gradlew bootRun
```
The application will start on port `5030`.

### With Docker Compose

To start the application in a container:

```bash
docker compose up --build
```
The application will be available at `http://localhost:5030`.

### API Documentation

Once the application is running, you can access the Swagger UI at:
`http://localhost:5030/swagger-ui.html`
