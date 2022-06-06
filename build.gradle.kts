import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    application
}

group = "me.kamilcaglar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val koin_version= "3.2.0"
    implementation("io.insert-koin:koin-core:$koin_version")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "16"
}

application {
    mainClass.set("MainKt")
}