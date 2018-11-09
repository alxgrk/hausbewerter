import org.jetbrains.kotlin.config.AnalysisFlag.Flags.experimental
import org.jetbrains.kotlin.gradle.frontend.KotlinFrontendExtension
import org.jetbrains.kotlin.gradle.frontend.util.kotlinTestOutput
import org.jetbrains.kotlin.gradle.frontend.webpack.WebPackBundleTask
import org.jetbrains.kotlin.gradle.frontend.webpack.WebPackBundler
import org.jetbrains.kotlin.gradle.frontend.webpack.WebPackExtension
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import kotlin.io.*

val kotlinVersion = "1.3.0"
val reactVersion = "16.5.2"
val reactRouterDomVersion = "4.3.1"
val kotlinWrapperVersion = "58"

plugins {
    id("kotlin2js") version "1.3.0"
    id("org.jetbrains.kotlin.frontend") version "0.0.31"
}

group = "de.alxgrk"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
    google()
    gradlePluginPortal()
    maven {
        url = uri("https://kotlin.bintray.com/kotlin-js-wrappers/")
    }
}

dependencies {
    compile(kotlin("stdlib-js", kotlinVersion))

    compile("org.jetbrains.kotlinx:kotlinx-html-js:0.6.11")

    compile("org.jetbrains:kotlin-react:$reactVersion-pre.$kotlinWrapperVersion-kotlin-$kotlinVersion")
    compile("org.jetbrains:kotlin-react-dom:$reactVersion-pre.$kotlinWrapperVersion-kotlin-$kotlinVersion")
    compile("org.jetbrains:kotlin-react-router-dom:$reactRouterDomVersion-pre.$kotlinWrapperVersion-kotlin-$kotlinVersion")
    compile("org.jetbrains:kotlin-extensions:1.0.1-pre.$kotlinWrapperVersion-kotlin-$kotlinVersion")

    compile(kotlin("test-js", kotlinVersion))
    testCompile(kotlin("test-js", kotlinVersion))
}

kotlinFrontend {

    downloadNodeJsVersion = "latest"

    sourceMaps = false

    npm {

        dependency("react", "^$reactVersion")
        dependency("react-dom", "^$reactVersion")
        dependency("react-jsonschema-form", "^1.0.4")
        dependency("react-materialize", "^2.2.0")
        dependency("react-router-dom", "^$reactRouterDomVersion")
        dependency("axios", "^0.18.0")
        dependency("path", "^0.12.7")

        devDependency("karma")
        devDependency("@jetbrains/ts2kt-automator", "^1.0.12")
    }

    webpack {
        bundleName = "main"
        contentPath = file("src/main/resources")
        proxyUrl = "http://localhost:9090"
    }

}

tasks.withType<Kotlin2JsCompile>()
        .first { it.name == "compileKotlin2Js" }
        .apply {
            kotlinOptions.apply {
                metaInfo = true
                outputFile = "${project.buildDir.path}/js/${project.name}.js"
                sourceMap = true
                sourceMapEmbedSources = "always"
                moduleKind = "commonjs"
                main = "call"
            }
        }

tasks.withType<Kotlin2JsCompile>()
        .first { it.name == "compileTestKotlin2Js" }
        .apply {
            kotlinOptions.apply {
                metaInfo = true
                outputFile = "${project.buildDir.path}/js-tests/${project.name}-tests.js"
                sourceMap = true
                moduleKind = "commonjs"
                // kotlinOptions.moduleName = project.name + "-test"
                main = "call"
            }
        }

fun KotlinFrontendExtension.webpack(config: WebPackExtension.() -> Unit) {
    extensions.add("webpackBundle", WebPackExtension(project))
    bundle("webpack", delegateClosureOf(config))
}