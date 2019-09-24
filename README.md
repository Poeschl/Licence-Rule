# Licence-Rules

This repro acts as test project for creating new normalizer / merge rules for [jk1/Gradle-Licence-Report](https://github.com/jk1/Gradle-License-Report) and [license-maven-plugin](https://github.com/mojohaus/license-maven-plugin).

It contains a lot of dependencies that I use in my daily and private coding.
Feel free to add yours for test and think about contributing back.
In case of the gradle plugin you can also apply your changes to the default `license-normilzer-bundle.json`.

## Execution

Gradle: `./gradlew generateLicenseReport`

Maven: `./mvnw license:third-party-report`

### Todo

* Create merge rules for the maven plugin
