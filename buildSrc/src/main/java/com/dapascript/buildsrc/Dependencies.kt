package com.dapascript.buildsrc

object AndroidProjectConfig {
    const val applicationId = "com.dapascript.modular"
    const val minSdk = 21
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object Libraries {
    const val androidCore = "androidx.core:core-ktx:1.9.0"
    const val androidAppCompat = "androidx.appcompat:appcompat:1.6.1"
    const val androidMaterial = "com.google.android.material:material:1.8.0"
    const val androidConstraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val androidLifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.6.0"
    const val androidLifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.0"
    const val androidNavigationFragment = "androidx.navigation:navigation-fragment-ktx:2.5.3"
    const val androidNavigationUI = "androidx.navigation:navigation-ui-ktx:2.5.3"
    const val testJunit = "junit:junit:4.13.2"
    const val androidTestJunit = "androidx.test.ext:junit:1.1.5"
    const val androidTestEspresso = "androidx.test.espresso:espresso-core:3.5.1"
}