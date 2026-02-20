pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

fun addFeatureModule(path: String) {
    include(
        "$path:module",
        "$path:presentation",
        "$path:navigation",
        "$path:api",
        "$path:domain",
        "$path:data"
    )
}

rootProject.name = "SSH-Architecture"
include(":app")
addFeatureModule(path = "feature_a")
 