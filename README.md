# Navigation Drawer
Material Design Navigation Drawer in Kotlin.

It requires Kotlin plugin in your Android Studio.


How to apply :

Go to File/Settings/plugin and install Kotlin plugin.

Project : 

build.gradle

apply plugin: 'kotlin-android'

sourceSets {
        main.java.srcDirs += 'src/main/kotlin'
    }
    
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:23.2.0'
    compile 'com.android.support:design:23.2.0'
    compile "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
}

buildscript {
    ext.kotlin_version = '1.0.0'
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}
