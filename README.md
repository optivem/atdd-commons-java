# ATDD Commons (Java)

[![Build](https://github.com/optivem/atdd-commons-java/actions/workflows/build.yml/badge.svg)](https://github.com/optivem/atdd-commons-java/actions/workflows/build.yml)
[![](https://jitpack.io/v/optivem/atdd-commons-java.svg)](https://jitpack.io/#optivem/atdd-commons-java)

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
    <artifactId>atdd-commons</artifactId>
    <version>1.0.4</version>
    <!-- Or use major version only (recommended): -->
    <!-- <version>[1.0,2.0)</version> -->
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
    implementation 'com.github.optivem:atdd-commons:1.0.4'
    // Or use major version only (recommended):
    // implementation 'com.github.optivem:atdd-commons:1.+'
}
```

## Usage

```java
import com.optivem.atdd.commons.channels.Channel;
import org.junit.jupiter.api.TestTemplate;

public class ExampleTest {
    @Channel({"web", "mobile", "api"})
    void testAcrossChannels() {
        String channel = ChannelContext.get();
        // Test logic that runs for each channel
    }
}
```

## Features

- **Channel Testing**: Annotations and utilities for multi-channel test execution
  - `@Channel`: Annotation for defining channel-based parameterized tests
  - `ChannelContext`: Thread-local context for managing channel state
  - `ChannelExtension`: JUnit 5 extension for channel-based test execution

## Building

To build the library locally:

### Using Gradle

```bash
./gradlew build
```

Or on Windows:

```cmd
gradlew.bat build
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.
