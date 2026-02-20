plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.ssh.ssh_architecture.feature_a.data"
    defaultConfig {
        compileSdk = 36
        minSdk = 24
    }
}

dependencies {
    implementation(dependencyNotation = projects.featureA.domain)
}
