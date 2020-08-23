object Plugins {

  const val androidApplication = "com.android.application"
  const val androidLibrary = "com.android.library"
  const val atomicFu = "kotlinx-atomicfu"
  const val benManes = "com.github.ben-manes.versions"
  const val crashlytics = "com.google.firebase.crashlytics"
  const val dokka = "org.jetbrains.dokka"
  const val detekt = "io.gitlab.arturbosch.detekt"
  const val javaLibrary = "java-library"
  const val knit = "kotlinx-knit"
  const val kotlin = "kotlin"
  const val kotlinKapt = "kotlin-kapt"
  const val kotlinAndroid = "kotlin-android"
  const val kotlinAndroidExtensions = "kotlin-android-extensions"
  const val mavenPublish = "com.vanniktech.maven.publish"
  const val spoon = "com.jaredsburrows.spoon"
}

object Versions {
  const val benManes = "0.28.0"
  const val dokka = "0.10.1"
  const val knit = "0.1.3"

  const val compileSdk = 29
  const val minSdk = "23"
  const val targetSdk = 29
  const val buildTools = "29.0.2"

  const val androidTools = "4.0.0" // update the buildSrc gradle dependency too!
  const val firebase = "1.1.5"
  const val gms = "4.3.3"
  const val kotlin = "1.3.72" // update the buildSrc gradle dependency too!
  const val sonarPlugin = "2.6.1"
  const val spoon = "1.5.0"
}

object BuildPlugins {

  const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidTools}"
  const val atomicFu = "org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.14.1"
  const val benManesVersions = "com.github.ben-manes:gradle-versions-plugin:${Versions.benManes}"
  const val crashlytics = "com.google.firebase:firebase-crashlytics-gradle:2.1.0"
  const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
  const val firebase = "com.google.firebase:firebase-plugins:${Versions.firebase}"
  const val googleServices = "com.google.gms:google-services:${Versions.gms}"
  const val knit = "org.jetbrains.kotlinx:kotlinx-knit:${Versions.knit}"
  const val kotlinAndroid = "kotlin-android"
  const val kotlinAndroidExtensions = "kotlin-android-extensions"
  const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  const val spoon = "com.jaredsburrows:gradle-spoon-plugin:${Versions.spoon}"
}

object Libs {

  object Android {
    const val archCoreTesting = "android.arch.core:core-testing:2.0.0"
    const val mapUtils = "com.google.maps.android:android-maps-utils:0.5"

    const val uiAutomator = "com.android.support.test.uiautomator:uiautomator-v18:2.0.0"
  }

  object Androidx {
    const val annotation = "androidx.annotation:annotation:1.1.0"
    const val appcompat = "androidx.appcompat:appcompat:1.1.0"
    const val cardView = "androidx.cardview:cardview:1.0.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val coreKtx = "androidx.core:core-ktx:1.1.0"
    const val coreTesting = "androidx.arch.core:core-testing:2.1.0"
    const val exifinterface = "androidx.exifinterface:exifinterface:1.1.0"

    const val legacySupport13 = "androidx.legacy:legacy-support-v13:1.0.0"

    const val junit = "androidx.test.ext:junit:1.1.1"
    const val multidex = "androidx.multidex:multidex:2.0.1"
    const val paging = "androidx.paging:paging-runtime:2.1.0"
    const val percentLayout = "androidx.percentlayout:percentlayout:1.0.0"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
    const val security = "androidx.security:security-crypto:1.0.0-rc03"
    const val viewPager2 = "androidx.viewpager2:viewpager2:1.0.0"

    object Camera {
      private const val version = "1.0.0-beta07"
      const val core = "androidx.camera:camera-camera2:$version"
      const val extensions = "androidx.camera:camera-extensions:$version"
      const val lifecycle = "androidx.camera:camera-lifecycle:$version"
      const val view = "androidx.camera:camera-view:1.0.0-alpha14"
    }

    object Fragment {

      private const val version = "1.2.4"

      const val core = "androidx.fragment:fragment:$version"
      const val ktx = "androidx.fragment:fragment-ktx:$version"
      const val testing = "androidx.fragment:fragment-testing:$version"
    }

    object Room {

      private const val version = "2.2.5"

      const val runtime = "androidx.room:room-runtime:$version"
      const val ktx = "androidx.room:room-ktx:$version"
      const val compiler = "androidx.room:room-compiler:$version"
      const val testing = "androidx.room:room-testing:$version"
    }

    object Lifecycle {

      private const val version = "2.2.0"

      const val common = "androidx.lifecycle:lifecycle-common:$version"
      const val extensions = "androidx.lifecycle:lifecycle-extensions:$version"
      const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
      const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
      const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
    }

    object Test {
      const val core = "androidx.test:core:1.2.0"
      const val jUnit = "androidx.test.ext:junit:1.1.1"
      const val orchestrator = "androidx.test:orchestrator:1.2.0"
      const val rules = "androidx.test:rules:1.2.0"
      const val runner = "androidx.test:runner:1.2.0"
      const val truth = "androidx.test.ext:truth:1.2.0"

      object Espresso {
        const val contrib = "androidx.test.espresso:espresso-contrib:3.2.0"
        const val core = "androidx.test.espresso:espresso-core:3.2.0"
        const val intents = "androidx.test.espresso:espresso-intents:3.2.0"
        const val web = "androidx.test.espresso:espresso-web:3.2.0"
      }
    }

    object WorkManager {
      private const val version = "2.4.0"

      const val core = "androidx.work:work-runtime:$version"
      const val ktx = "androidx.work:work-runtime-ktx:$version"
      const val test = "androidx.work:work-testing:$version"
    }
  }

  object Apache {
    const val commons = "commons-io:commons-io:2.6"
  }

  object AppCenter {
    const val analytics = "com.microsoft.appcenter:appcenter-analytics:2.1.0"
    const val crashes = "com.microsoft.appcenter:appcenter-crashes:2.1.0"
    const val distribute = "com.microsoft.appcenter:appcenter-distribute:2.1.0"
  }

  object Auth0 {
    const val jwtDecode = "com.auth0.android:jwtdecode:1.3.0"
    const val sdk = "com.auth0.android:auth0:1.16.0"
  }

  object BouncyCastle {
    private const val version = "1.65.01"

    const val core = "org.bouncycastle:bcprov-jdk15on:$version"

    // The Bouncy Castle Java APIs for CMS, PKCS, EAC, TSP, CMP, CRMF, OCSP, and certificate generation.
    const val extendedApis = "org.bouncycastle:bcpkix-jdk15on:1.65"

  }

  object BumpTech {
    const val glide = "com.github.bumptech.glide:glide:4.11.0"
    const val glideCompiler = "com.github.bumptech.glide:compiler:4.11.0"
  }

  object Dagger {
    private const val version = "2.27"
    const val android = "com.google.dagger:dagger-android:$version"
    const val androidKapt = "com.google.dagger:dagger-android-processor:$version"
    const val androidSupport = "com.google.dagger:dagger-android-support:$version"
    const val compiler = "com.google.dagger:dagger-compiler:$version"
    const val core = "com.google.dagger:dagger:$version"
  }

  object Detekt {
    const val version = "1.9.1"
    const val api = "io.gitlab.arturbosch.detekt:detekt-api:$version"
    const val cli = "io.gitlab.arturbosch.detekt:detekt-cli:$version"
    const val formatting = "io.gitlab.arturbosch.detekt:detekt-formatting:$version"
    const val test = "io.gitlab.arturbosch.detekt:detekt-test:$version"
  }

  object Epoxy {
    private const val version = "3.8.0"
    const val epoxy = "com.airbnb.android:epoxy:$version"
    const val paging = "com.airbnb.android:epoxy-paging:$version"
    const val dataBinding = "com.airbnb.android:epoxy-databinding:$version"
    const val processor = "com.airbnb.android:epoxy-processor:$version"
  }

  object Firebase {
    const val analytics = "com.google.firebase:firebase-analytics:17.4.3"
    const val config = "com.google.firebase:firebase-config-ktx:19.1.4"
    const val crashlytics = "com.google.firebase:firebase-crashlytics:17.0.1"
    const val messaging = "com.google.firebase:firebase-messaging:20.2.0"
    const val mlVision = "com.google.firebase:firebase-ml-vision:24.0.1"
    const val performance = "com.google.firebase:firebase-perf:19.0.7"
  }

  object Google {
    const val autoService = "com.google.auto.service:auto-service:1.0-rc6"
    const val findBugs = "com.google.code.findbugs:jsr305:3.0.2"
    const val material = "com.google.android.material:material:1.1.0"
    const val placesSdk = "com.google.android.libraries.places:places:2.3.0"
    const val playServicesLocation = "com.google.android.gms:play-services-location:16.0.0"
    const val playServicesMaps = "com.google.android.gms:play-services-maps:16.1.0"
    const val playServicesNearby = "com.google.android.gms:play-services-nearby:16.0.0"
    const val truth = "com.google.truth:truth:0.44"
  }

  object JakeWharton {
    const val timber = "com.jakewharton.timber:timber:4.7.1"
  }

  object Json {
    const val test = "org.json:json:20200518"
  }

  object JSoup {
    const val core = "org.jsoup:jsoup:1.11.3"
  }

  object JUnit {
    private const val version = "5.6.0"

    const val api = "org.junit.jupiter:junit-jupiter-api:$version"
    const val params = "org.junit.jupiter:junit-jupiter-params:$version"
    const val runtime = "org.junit.jupiter:junit-jupiter-engine:$version"
    const val vintage = "org.junit.vintage:junit-vintage-engine:$version"
  }

  object Kotlin {
    const val compiler = "org.jetbrains.kotlin:kotlin-compiler-embeddable:${Versions.kotlin}"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
  }

  object Kotest {
    private const val version = "4.1.1"
    const val assertions = "io.kotest:kotest-assertions-core-jvm:$version"
    const val properties = "io.kotest:kotest-property-jvm:$version"
    const val runner = "io.kotest:kotest-runner-junit5-jvm:$version"
    const val consoleRunner = "io.kotest:kotest-runner-console-jvm:$version"
  }

  object Kotlinx {
    object Coroutines {
      private const val version = "1.3.7"
      const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
      const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
      const val playServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$version"
      const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }
  }

  object Mcxiaoke {
    const val photoview = "com.mcxiaoke.photoview:library:1.2.3"
  }

  object MockK {
    const val core = "io.mockk:mockk:1.9.3"
  }

  object Objenesis {
    const val core = "org.objenesis:objenesis:2.6"
  }

  object PhilJay {
    const val mpAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.1.0"
  }

  object Qualtrics {
    const val digital = "com.qualtrics:digital:1.4"
  }

  object Relex {
    const val circleIndicator = "me.relex:circleindicator:2.1.4"
  }

  object RickBusarow {

    object Hermit {
      private const val version = "0.9.1"
      const val core = "com.rickbusarow.hermit:hermit-core:$version"
      const val junit4 = "com.rickbusarow.hermit:hermit-junit4:$version"
      const val junit5 = "com.rickbusarow.hermit:hermit-junit5:$version"
      const val mockk = "com.rickbusarow.hermit:hermit-mockk:$version"
      const val coroutines = "com.rickbusarow.hermit:hermit-coroutines:$version"
    }

    object Dispatch {

      private const val version = "1.0.0-beta04"

      const val core = "com.rickbusarow.dispatch:dispatch-core:$version"
      const val detekt = "com.rickbusarow.dispatch:dispatch-detekt:$version"
      const val espresso = "com.rickbusarow.dispatch:dispatch-android-espresso:$version"
      const val extensions = "com.rickbusarow.dispatch:dispatch-extensions:$version"
      const val lifecycle = "com.rickbusarow.dispatch:dispatch-android-lifecycle:$version"
      const val lifecycleExtensions = "com.rickbusarow.dispatch:dispatch-android-lifecycle-extensions:$version"
      const val viewModel = "com.rickbusarow.dispatch:dispatch-android-viewmodel:$version"

      object Test {
        const val core = "com.rickbusarow.dispatch:dispatch-test:$version"
        const val jUnit4 = "com.rickbusarow.dispatch:dispatch-test-junit4:$version"
        const val jUnit5 = "com.rickbusarow.dispatch:dispatch-test-junit5:$version"

      }
    }
  }

  object Robolectric {
    const val core = "org.robolectric:robolectric:4.3.1"
  }

  object Roomigrant {
    private const val version = "0.2.6"
    const val library = "com.github.RBusarow.Roomigrant:RoomigrantLib:$version"
    const val compiler = "com.github.RBusarow.Roomigrant:RoomigrantCompiler:$version"
  }

  object Sephiroth {
    const val bottomNavigation = "it.sephiroth.android.library.bottomnavigation:bottom-navigation:3.0.0"
  }

  object SergiVonavi {
    const val materialBanner = "com.sergivonavi:materialbanner:1.2.0"
  }

  object Square {
    const val assistedInjectAnnotations = "com.squareup.inject:assisted-inject-annotations-dagger2:0.5.2"
    const val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.5.2"

    const val javaPoet = "com.squareup:javapoet:1.12.1"

    const val okio = "com.squareup.okio:okio:2.4.1"
    const val picasso = "com.squareup.picasso:picasso:2.5.2"
    const val spoon = "com.squareup.spoon:spoon-client:1.7.1"

    object AssistedInject {
      private const val version = "0.5.2"

      const val assistedInjectAnnotations = "com.squareup.inject:assisted-inject-annotations-dagger2:0.5.2"
      const val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.5.2"

      const val annotations = "com.squareup.inject:assisted-inject-annotations-dagger2:$version"
      const val processor = "com.squareup.inject:assisted-inject-processor-dagger2:$version"
    }

    object KotlinPoet {
      private const val version = "1.6.0"

      const val core = "com.squareup:kotlinpoet:$version" // update the buildSrc gradle dependency too!
      const val classInspectorElements = "com.squareup:kotlinpoet-classinspector-elements:$version"
      const val metadata = "com.squareup:kotlinpoet-metadata:$version"
      const val metadataSpecs = "com.squareup:kotlinpoet-metadata-specs:$version"

    }

    object Moshi {
      private const val version = "1.9.3"

      const val core = "com.squareup.moshi:moshi:$version"
      const val adapters = "com.squareup.moshi:moshi-adapters:$version"
      const val kotlin = "com.squareup.moshi:moshi-kotlin:$version"
      const val kotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$version"
    }

    object OkHttp {
      private const val version = "4.3.1"

      const val mockWebServer = "com.squareup.okhttp3:mockwebserver:$version"
      const val core = "com.squareup.okhttp3:okhttp:$version"
      const val logging = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Retrofit {
      private const val version = "2.7.1"

      const val core = "com.squareup.retrofit2:retrofit:$version"
      const val moshi = "com.squareup.retrofit2:converter-moshi:$version"
      const val mock = "com.squareup.retrofit2:retrofit-mock:$version"
    }

  }

  /**
   * Used for incremental annotation processing
   */
  object ThomasBroyer {
    private const val version = "0.2"
    const val runtime = "net.ltgt.gradle.incap:incap:$version"
    const val processor = "net.ltgt.gradle.incap:incap-processor:$version"
  }

  object TomRoush {
    const val pdfbox = "com.tom_roush:pdfbox-android:1.8.10.0"
  }

  object Yalantis {
    const val ucrop = "com.github.yalantis:ucrop:2.2.4"
  }

}
