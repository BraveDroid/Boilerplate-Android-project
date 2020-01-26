# Boilerplate-Android-project
Boilerplate Android project setup

## gitignore file
- with ignoring sub directories

## Gradle dependecies
- Android jetpack room, navigation-component, safe/args 
- material.io design
- retrofit
- gson/moshi
- glide/coil
- tests (instruments/jvm)
- kotlin java8
- databinding


 
| Build type|Debug| Release|
|:-------------:|:-------------:|:-----:|
|Description| possibility to see logs, to debug with stetho,, "applicationIdSuffix".debug,  |  report crashes and no possibility for debugging, signature should be downloaded to .properties/keystore.properties (not tracked) |


| ProductFlavor (pricing)|Pro| Free|
|:-------------:|:-------------:|:-----:|
|Description| applicationIdSuffix ".pro"| applicationIdSuffix ".free" |


| ProductFlavor (env)|prod| qa| dev|
|:-------------:|:-------------:|:-----:|:-----:|
|Description|without leakcanary |applicationIdSuffix ".qa" without leakcanary|applicationIdSuffix ".dev"  with leakcanary


.pro (pro/prod/release)
.pro.debug (pro/prod/debug)
.pro.qa (pro/qa/release)
.pro.qa.debug (pro/qa/debug)
.pro.dev (pro/dev/release)
.pro.dev.debug (pro/dev/debug)

.free (free/prod/release)
.free.debug (free/prod/debug)
.free.qa (free/qa/release)
.free.qa.debug (free/qa/debug)
.free.dev (free/dev/release)
.free.dev.debug (free/dev/debug)
  
