plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.dapascript.notifications"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    api(com.dapascript.buildsrc.Libraries.androidCore)
    api(com.dapascript.buildsrc.Libraries.androidAppCompat)
    api(com.dapascript.buildsrc.Libraries.androidMaterial)
    api(com.dapascript.buildsrc.Libraries.androidConstraintLayout)
    api(com.dapascript.buildsrc.Libraries.androidLifecycleLiveData)
    api(com.dapascript.buildsrc.Libraries.androidLifecycleViewModel)
    api(com.dapascript.buildsrc.Libraries.androidNavigationUI)
    api(com.dapascript.buildsrc.Libraries.androidNavigationFragment)
}