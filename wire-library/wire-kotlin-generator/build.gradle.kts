import com.vanniktech.maven.publish.JavadocJar.Dokka
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension

plugins {
  id("java-library")
  kotlin("jvm")
  id("org.jetbrains.dokka")
  id("com.vanniktech.maven.publish.base")
}

dependencies {
  api(project(":wire-schema"))
  implementation(project(":wire-runtime"))
  implementation(project(":wire-grpc-client"))
  implementation(project(":wire-grpc-server-generator"))
  implementation(libs.okio.core)
  api(libs.kotlinpoet)
  implementation(libs.guava)
  testImplementation(project(":wire-test-utils"))
  testImplementation(deps.kotlin.test.junit)
  testImplementation(deps.truth)
}

configure<MavenPublishBaseExtension> {
  configure(
    KotlinJvm(javadocJar = Dokka("dokkaGfm"), sourcesJar = true)
  )
}
