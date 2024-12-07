plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.marcelo.cristhian.labmarcelo"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.marcelo.cristhian.labmarcelo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
// Habilita ViewBinding para permitir un manejo más seguro y directo de las vistas en la interfaz de usuario.
    buildFeatures{
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Define la versión de CameraX utilizada en las dependencias siguientes.
    val cameraxVersion = "1.0.1"
// Implementa el módulo camera2 de CameraX para control avanzado de la cámara.
    implementation("androidx.camera:camera-camera2:$cameraxVersion")
// Implementa el módulo lifecycle de CameraX para integrar la cámara con el ciclo de vida de la app.
    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
// Añade la biblioteca camera-view para facilitar la visualización de la cámara en la UI.
    implementation("androidx.camera:camera-view:1.0.0-alpha27")
// Implementa Glide para manejar carga y manipulación de imágenes.
    implementation("com.github.bumptech.glide:glide:4.12.0")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

}