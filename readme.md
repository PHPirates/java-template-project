[![Build Status](https://travis-ci.org/PHPirates/java-template-project.svg?branch=master)](https://travis-ci.org/PHPirates/java-template-project)

# Template project for simple use cases of Gradle

It currently makes use of
* Java
* Kotlin
* Junit 5
* Travis CI
* Gradle
* The Gradle wrapper (gradlew)
* [TestFX](https://github.com/TestFX/TestFX) to use JavaFX components in tests

## Tips
This was only tested with IntelliJ.

* You can quickly import the project into IntelliJ by importing the `build.gradle` file.

* You can run `gradlew test` on the terminal to run the tests via gradle with the gradle wrapper (so you don't have to first install gradle locally by hand).

* If you see all gradle keywords greyed out you may want to link the Gradle project in IntelliJ, if you do not see a popup asking you to then go to modules - import module and select your build.gradle.

## Notes

Originally based on an idea by [mcona](https://github.com/mplacona/java-junit-template-project).
