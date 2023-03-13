import com.dapascript.buildsrc.AndroidProjectConfig
import com.dapascript.buildsrc.Libraries

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "modular"
    compileSdk = 33

    defaultConfig {
        applicationId = AndroidProjectConfig.applicationId
        minSdk = AndroidProjectConfig.minSdk
        targetSdk = AndroidProjectConfig.targetSdk
        versionCode = AndroidProjectConfig.versionCode
        versionName = AndroidProjectConfig.versionName
        testInstrumentationRunner = AndroidProjectConfig.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
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


    implementation(project(":features:home"))
    implementation(project(":features:dashboard"))
    implementation(project(":features:notifications"))
}