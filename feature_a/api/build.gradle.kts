plugins {
    kotlin("jvm")
}

dependencies {
    implementation(dependencyNotation = projects.featureA.domain)
}