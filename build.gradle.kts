plugins {
    `java`
    `java-library`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

//val springBootVersion = "3.1.5"
val springBootVersion = "3.2.0"

dependencies {
    compileOnly("org.jetbrains:annotations:24.1.0")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    implementation("org.springframework.boot:spring-boot-autoconfigure:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")

    annotationProcessor("org.springframework.boot:spring-boot-autoconfigure-processor:$springBootVersion")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor:$springBootVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-configuration-processor:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-validation:$springBootVersion")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
}

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
