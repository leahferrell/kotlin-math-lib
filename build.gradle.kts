plugins {
	application
	id("java")
	id("org.jetbrains.kotlin.jvm") version "1.3.61"
}

repositories {
	maven {
		url = uri("https://repo1.maven.org/maven2/")
	}
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")

	testImplementation("org.jetbrains.kotlin:kotlin-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
	mainClassName = "com.leah.math.MathKt"
}
