plugins {
    base
    java
    maven
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

allprojects {
    group = "com.networknt"
    version = "1.0.0"
    repositories {
        mavenLocal() // mavenLocal must be added first.
        jcenter()
    }
}

dependencies {
    // Make the root project archives configuration depend on every sub-project
    subprojects.forEach {
        archives(it)
    }
}

