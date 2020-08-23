// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath ("com.android.tools.build:gradle:4.0.0")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
        classpath ("com.github.dcendents:android-maven-gradle-plugin:2.1")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean")
        .configure {
            delete("build")
        }