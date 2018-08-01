plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(ProjectConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        applicationId = "com.redridgeapps.movietracker"

        minSdkVersion(ProjectConfig.MIN_SDK_VERSION)
        targetSdkVersion(ProjectConfig.TARGET_SDK_VERSION)

        versionCode = 1
        versionName = "0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Testing
    testImplementation(Deps.Testing.JUNIT)
    androidTestImplementation(Deps.Testing.TEST)
    androidTestImplementation(Deps.Testing.ESPRESSO)

    // Kotlin
    implementation(kotlin(Deps.Kotlin.STDLIB, Deps.Kotlin.VERSION))

    // Jetpack
    implementation(Deps.Jetpack.APPCOMPAT)

    // Tools
    implementation(Deps.Tools.CONSTRAINT_LAYOUT)
}
