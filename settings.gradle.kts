rootProject.name = "poc"

// APPS
include(
    "apps:aap-vilkår",
    "apps:functional-program",
    "apps:kafka-streams-avro",
    "apps:kafka-streams-json",
)

include(
    "ddd:fred-george"
)

// CONTRACTS
include(
    "contracts:aap-avro",
    "contracts:aap-json",
)

// KTOR
include(
    "libs:ktor:essentials",
)

// FUNCTIONAL PROGRAMMING
include(
    "libs:fp:either",
    "libs:fp:lenses",
)

// KAFKA
include(
    "libs:kafka:kafka",
    "libs:kafka:streams",
    "libs:kafka:mock",
)

include("libs:kotlinx-serde")
include("libs:exposed")
include("libs:utils")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven(url = "https://dl.bintray.com/gradle/gradle-plugins")
    }
}