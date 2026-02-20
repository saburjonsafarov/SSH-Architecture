plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.ssh.ssh_architecture.feature_a.presentation"

    defaultConfig {
        compileSdk = 36
        minSdk = 24
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(dependencyNotation = projects.featureA.api)
}