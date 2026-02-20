plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.ssh.ssh_architecture.feature_a"
    defaultConfig {
        compileSdk = 36
        minSdk = 24
    }
}


dependencies {
    implementation(dependencyNotation = projects.featureA.api)
    implementation(dependencyNotation = projects.featureA.domain)
    implementation(dependencyNotation = projects.featureA.presentation)
    implementation(dependencyNotation = projects.featureA.navigation)
    implementation(dependencyNotation = projects.featureA.data)
}
