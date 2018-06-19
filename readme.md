. | .
 --- | ---
Travis | [![Build Status](https://travis-ci.org/PHPirates/java-template-project.svg?branch=master)](https://travis-ci.org/PHPirates/java-template-project)
Coveralls | [![Coverage Status](https://coveralls.io/repos/github/PHPirates/java-template-project/badge.svg?branch=master)](https://coveralls.io/github/PHPirates/java-template-project?branch=master)
Codecov | [![codecov](https://codecov.io/gh/PHPirates/java-template-project/branch/master/graph/badge.svg)](https://codecov.io/gh/PHPirates/java-template-project)



# Template project for java

A similar template project in Kotlin is [here](https://github.com/PHPirates/kotlin-template-project).

From an idea by [Marcos Placona](https://github.com/mplacona/java-junit-template-project), but now it will be for Gradle, JUnit 5 and JavaFX.

This is intended for use with IntelliJ.

It currently makes use of
* IntelliJ
* Java
* Junit 5
* Travis CI
* Gradle
* The Gradle wrapper (gradlew)
* [TestFX](https://github.com/TestFX/TestFX) to use JavaFX components in tests
* JaCoCo to generate test coverage reports
* Coveralls to show some more test coverage statistics

## Tips
* You can quickly import the project into IntelliJ by importing the `build.gradle` file.

* You can run `gradlew test` on the terminal to run the tests via gradle with the gradle wrapper (so you don't have to first install gradle locally by hand).

* If you see all gradle keywords greyed out you may want to link the Gradle project in IntelliJ, if you do not see a popup asking you to then go to modules - import module and select your build.gradle.
