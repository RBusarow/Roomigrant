plugins {
  `kotlin-dsl`
}

repositories {
  google()
  jcenter()
  maven("https://oss.sonatype.org/content/repositories/snapshots")
}

kotlinDslPluginOptions {
  experimentalWarning.set(false)
}

dependencies {

  compileOnly(gradleApi())

  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7") // update Dependencies.kt as well
  implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.3.72") // update Dependencies.kt as well
  implementation("com.jaredsburrows:gradle-spoon-plugin:1.5.0") // update Dependencies.kt as well
  implementation("com.squareup:kotlinpoet:1.5.0") // update Dependencies.kt as well
  implementation("com.android.tools.build:gradle:4.0.0") // update Dependencies.kt as well
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72") // update Dependencies.kt as well
}

