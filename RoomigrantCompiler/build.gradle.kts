plugins {
    id("java-library")
    id("kotlin")
    id("com.github.dcendents.android-maven")
    id("kotlin-kapt")
}

group = "com.github.MatrixDev"

dependencies {
    implementation (project(":RoomigrantLib"))

    implementation("com.squareup:kotlinpoet:_")
    implementation("com.squareup.moshi:moshi-kotlin:_")
    implementation("androidx.room:room-runtime:_")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:_")

    kapt("com.squareup.moshi:moshi-kotlin-codegen:_")

    compileOnly("com.google.auto.service:auto-service:_")
    compileOnly("net.ltgt.gradle.incap:incap:0.3")
    kapt("net.ltgt.gradle.incap:incap-processor:0.3")
}
