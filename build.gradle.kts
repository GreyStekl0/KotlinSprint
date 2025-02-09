import io.gitlab.arturbosch.detekt.Detekt

plugins {
    kotlin("jvm") version "2.1.0"
    id("io.gitlab.arturbosch.detekt") version("1.23.7")
}

group = "org.stekl0"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

detekt {
    buildUponDefaultConfig = true // Предварительная настройка с использованием конфигурации по умолчанию
    allRules = false // Активировать все доступные (включая нестабильные) правила
}

tasks.withType<Detekt>().configureEach {
    reports {
        html.required.set(true) // Генерация HTML-отчета
        xml.required.set(false) // Генерация XML-отчета
        sarif.required.set(true) // Генерация SARIF-отчета
        md.required.set(true) // Генерация Markdown-отчета
        txt.required.set(false) // Генерация TXT-отчета
    }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}