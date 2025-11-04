# ATDD Commons Java

A common utilities library for Java projects.

## Installation

### Maven

Add JitPack repository to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Add the dependency:

```xml
<dependency>
    <groupId>com.github.optivem</groupId>
    <artifactId>atdd-commons-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

Add JitPack repository to your `build.gradle`:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```

Add the dependency:

```gradle
dependencies {
    implementation 'com.github.optivem:atdd-commons-java:1.0.0'
}
```

## Usage

```java
import com.github.optivem.atdd.commons.MathCommons;

public class Example {
    public static void main(String[] args) {
        int result = MathCommons.addition(5, 3);
        System.out.println("Result: " + result); // Output: Result: 8
    }
}
```

## Features

- **MathCommons**: Common mathematical utility functions
  - `addition(int a, int b)`: Adds two integers

## Building

To build the library locally:

```bash
mvn clean install
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.
