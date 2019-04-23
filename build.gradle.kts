plugins {
  `java-library`
}

repositories {
  jcenter()
}

dependencies {
  implementation("software.amazon.awssdk:s3:2.5.29")
  testImplementation("junit:junit:4.12")
}
