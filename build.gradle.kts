// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.devtoolKsp) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.navigationSafeArgs) apply false
    alias(libs.plugins.kotlin.parcelize) apply false
    alias(libs.plugins.hilt) apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.10" apply false
}