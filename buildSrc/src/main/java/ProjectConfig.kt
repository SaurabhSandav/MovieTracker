object ProjectConfig {
    const val COMPILE_SDK_VERSION = 28
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 28
}

object Deps {

    object Gradle {
        private const val PLUGIN_VERSION = "3.3.0-alpha03"

        const val PLUGIN = "com.android.tools.build:gradle:$PLUGIN_VERSION"
    }

    object Kotlin {
        const val VERSION = "1.2.50"

        const val GRADLE_PLUGIN = "gradle-plugin"
        const val STDLIB = "stdlib-jdk7"
    }

    object Testing {
        private const val JUNIT_VERSION = "4.12"
        private const val TEST_VERSION = "1.1.0-alpha3"
        private const val ESPRESSO_VERSION = "3.1.0-alpha3"

        const val JUNIT = "junit:junit:$JUNIT_VERSION"
        const val TEST = "androidx.test:runner:$TEST_VERSION"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:$ESPRESSO_VERSION"
    }

    object Jetpack {
        private const val VERSION = "1.0.0-beta01"

        const val APPCOMPAT = "androidx.appcompat:appcompat:$VERSION"
    }

    object Tools {
        private const val VERSION = "1.1.2"

        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:$VERSION"
    }
}
