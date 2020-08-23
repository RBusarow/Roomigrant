plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "dev.matrix.roomigrant.test"
        minSdkVersion(19)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        defaultConfig {
            kapt {
                arguments {
                    arg("room.schemaLocation", "$projectDir/schemas")
                }
            }
            javaCompileOptions {
                annotationProcessorOptions {
                    arguments = mapOf("room.incremental" to "true")
                }
            }
        }
    }

    sourceSets.getByName("androidTest")
            .resources.srcDirs(files("$projectDir/schemas"))

    buildTypes {
        named("release").configure {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:_")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:_")

    // room
    implementation("androidx.room:room-runtime:_")
    androidTestImplementation("androidx.room:room-testing:_")
    kapt("androidx.room:room-compiler:_")

    // roomigrant
    compileOnly(project(":RoomigrantLib"))
    kapt(project(":RoomigrantCompiler"))

    // testing
    testImplementation("androidx.test:core:_")
    testImplementation("androidx.test.ext:junit:_")
    testImplementation("junit:junit:_")
    androidTestImplementation("androidx.test:runner:_")
    androidTestImplementation("androidx.test.espresso:espresso-core:_")
}
