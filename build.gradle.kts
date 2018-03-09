group = "deltadak"
version = "0.0"

plugins {
    application
    kotlin("jvm") version "1.2.30"
}

application {
    mainClassName = "deltadak.HelloWorld"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}
