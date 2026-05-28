import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.4.3"
    id("io.spring.dependency-management") version "1.1.7"
    kotlin("jvm") version "2.1.10"
    kotlin("plugin.spring") version "2.1.10"
    id("org.openapi.generator") version "7.4.0"
}

group = "com.socratessimulator"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0")
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
}

//openApiGenerate {
//    generatorName.set("kotlin-spring")
//    inputSpec.set("$projectDir/src/main/resources/oas-wigo4it-koppelvak-lo-2026.030.json")
//    outputDir.set("$projectDir/src/main/generated")
//    apiPackage.set("com.socratessimulator.api")
//    modelPackage.set("com.socratessimulator.model")
//    globalProperties.set(mapOf(
//        "apis" to "false",
//        "models" to "false",
//        "supportingFiles" to "false"
//    ))
//    configOptions.set(mapOf(
//        "interfaceOnly" to "true",
//        "useSpringBoot3" to "true",
//        "useTags" to "true",
//        "serializationLibrary" to "jackson"
//    ))
//}


tasks.withType<KotlinCompile> {
    compilerOptions {
        freeCompilerArgs.add("-Xjsr305=strict")
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
