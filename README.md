## project files tree:

## basics directory tree.

```
.
├── app
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       └── main
│   │   │           └── basics
│   │   │               └── App.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       └── main
│   │   │       └── headers
│   │   │           └── java
│   │   │               └── main
│   │   └── tmp
│   │       └── compileJava
│   │           └── previous-compilation-data.bin
│   ├── build.gradle
│   └── src
│       ├── main
│       │   └── java
│       │       └── basics
│       │           └── App.java
│       └── test
│           └── java
│               └── basics
│                   └── AppTest.java
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
└── settings.gradle

```

## basiclibrary directory tree

```
.
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── lib
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       ├── main
│   │   │       │   └── basiclibrary
│   │   │       │       └── Library.class
│   │   │       └── test
│   │   │           └── basiclibrary
│   │   │               └── LibraryTest.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       ├── main
│   │   │       │       └── test
│   │   │       └── headers
│   │   │           └── java
│   │   │               ├── main
│   │   │               └── test
│   │   ├── reports
│   │   │   └── tests
│   │   │       └── test
│   │   │           ├── classes
│   │   │           │   └── basiclibrary.LibraryTest.html
│   │   │           ├── css
│   │   │           │   ├── base-style.css
│   │   │           │   └── style.css
│   │   │           ├── index.html
│   │   │           ├── js
│   │   │           │   └── report.js
│   │   │           └── packages
│   │   │               └── basiclibrary.html
│   │   ├── test-results
│   │   │   └── test
│   │   │       ├── TEST-basiclibrary.LibraryTest.xml
│   │   │       └── binary
│   │   │           ├── output.bin
│   │   │           ├── output.bin.idx
│   │   │           └── results.bin
│   │   └── tmp
│   │       ├── compileJava
│   │       │   └── previous-compilation-data.bin
│   │       ├── compileTestJava
│   │       │   └── previous-compilation-data.bin
│   │       └── test
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── basiclibrary
│       │   │       └── Library.java
│       │   └── resources
│       └── test
│           ├── java
│           │   └── basiclibrary
│           │       └── LibraryTest.java
│           └── resources
└── settings.gradle

```

## linter directory tree:

```
.
├── README.md
├── app
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       ├── main
│   │   │       │   └── linter
│   │   │       │       └── App.class
│   │   │       └── test
│   │   │           └── linter
│   │   │               └── AppTest.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       ├── main
│   │   │       │       └── test
│   │   │       └── headers
│   │   │           └── java
│   │   │               ├── main
│   │   │               └── test
│   │   ├── reports
│   │   │   └── tests
│   │   │       └── test
│   │   │           ├── classes
│   │   │           │   └── linter.AppTest.html
│   │   │           ├── css
│   │   │           │   ├── base-style.css
│   │   │           │   └── style.css
│   │   │           ├── index.html
│   │   │           ├── js
│   │   │           │   └── report.js
│   │   │           └── packages
│   │   │               └── linter.html
│   │   ├── resources
│   │   │   └── main
│   │   │       ├── testNoError.js
│   │   │       ├── testOneError.js
│   │   │       └── testSomeError.js
│   │   ├── test-results
│   │   │   └── test
│   │   │       ├── TEST-linter.AppTest.xml
│   │   │       └── binary
│   │   │           ├── output.bin
│   │   │           ├── output.bin.idx
│   │   │           └── results.bin
│   │   └── tmp
│   │       ├── compileJava
│   │       │   └── previous-compilation-data.bin
│   │       ├── compileTestJava
│   │       │   └── previous-compilation-data.bin
│   │       └── test
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── linter
│       │   │       └── App.java
│       │   └── resources
│       │       ├── testNoError.js
│       │       ├── testOneError.js
│       │       └── testSomeError.js
│       └── test
│           ├── java
│           │   └── linter
│           │       └── AppTest.java
│           └── resources
├── gates.js
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
└── settings.gradle

```

## inheritance directory tree

```
.
├── README.md
├── basiclibrary
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   ├── lib
│   │   ├── build
│   │   │   ├── classes
│   │   │   │   └── java
│   │   │   │       ├── main
│   │   │   │       │   └── basiclibrary
│   │   │   │       │       └── Library.class
│   │   │   │       └── test
│   │   │   │           └── basiclibrary
│   │   │   │               └── LibraryTest.class
│   │   │   ├── generated
│   │   │   │   └── sources
│   │   │   │       ├── annotationProcessor
│   │   │   │       │   └── java
│   │   │   │       │       ├── main
│   │   │   │       │       └── test
│   │   │   │       └── headers
│   │   │   │           └── java
│   │   │   │               ├── main
│   │   │   │               └── test
│   │   │   ├── reports
│   │   │   │   └── tests
│   │   │   │       └── test
│   │   │   │           ├── classes
│   │   │   │           │   └── basiclibrary.LibraryTest.html
│   │   │   │           ├── css
│   │   │   │           │   ├── base-style.css
│   │   │   │           │   └── style.css
│   │   │   │           ├── index.html
│   │   │   │           ├── js
│   │   │   │           │   └── report.js
│   │   │   │           └── packages
│   │   │   │               └── basiclibrary.html
│   │   │   ├── test-results
│   │   │   │   └── test
│   │   │   │       ├── TEST-basiclibrary.LibraryTest.xml
│   │   │   │       └── binary
│   │   │   │           ├── output.bin
│   │   │   │           ├── output.bin.idx
│   │   │   │           └── results.bin
│   │   │   └── tmp
│   │   │       ├── compileJava
│   │   │       │   └── previous-compilation-data.bin
│   │   │       ├── compileTestJava
│   │   │       │   └── previous-compilation-data.bin
│   │   │       └── test
│   │   ├── build.gradle
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── basiclibrary
│   │       │   │       └── Library.java
│   │       │   └── resources
│   │       └── test
│   │           ├── java
│   │           │   └── basiclibrary
│   │           │       └── LibraryTest.java
│   │           └── resources
│   └── settings.gradle
├── basics
│   ├── app
│   │   ├── build
│   │   │   ├── classes
│   │   │   │   └── java
│   │   │   │       └── main
│   │   │   │           └── basics
│   │   │   │               └── App.class
│   │   │   ├── generated
│   │   │   │   └── sources
│   │   │   │       ├── annotationProcessor
│   │   │   │       │   └── java
│   │   │   │       │       └── main
│   │   │   │       └── headers
│   │   │   │           └── java
│   │   │   │               └── main
│   │   │   └── tmp
│   │   │       └── compileJava
│   │   │           └── previous-compilation-data.bin
│   │   ├── build.gradle
│   │   └── src
│   │       ├── main
│   │       │   └── java
│   │       │       └── basics
│   │       │           └── App.java
│   │       └── test
│   │           └── java
│   │               └── basics
│   │                   └── AppTest.java
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   └── settings.gradle
├── inheritance
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   ├── lib
│   │   ├── build
│   │   │   ├── classes
│   │   │   │   └── java
│   │   │   │       ├── main
│   │   │   │       │   └── inheritance
│   │   │   │       │       ├── Library.class
│   │   │   │       │       ├── Restaurant.class
│   │   │   │       │       ├── Review.class
│   │   │   │       │       ├── Shop.class
│   │   │   │       │       └── Theater.class
│   │   │   │       └── test
│   │   │   │           └── inheritance
│   │   │   │               └── LibraryTest.class
│   │   │   ├── generated
│   │   │   │   └── sources
│   │   │   │       ├── annotationProcessor
│   │   │   │       │   └── java
│   │   │   │       │       ├── main
│   │   │   │       │       └── test
│   │   │   │       └── headers
│   │   │   │           └── java
│   │   │   │               ├── main
│   │   │   │               └── test
│   │   │   ├── reports
│   │   │   │   └── tests
│   │   │   │       └── test
│   │   │   │           ├── classes
│   │   │   │           │   └── inheritance.LibraryTest.html
│   │   │   │           ├── css
│   │   │   │           │   ├── base-style.css
│   │   │   │           │   └── style.css
│   │   │   │           ├── index.html
│   │   │   │           ├── js
│   │   │   │           │   └── report.js
│   │   │   │           └── packages
│   │   │   │               └── inheritance.html
│   │   │   ├── test-results
│   │   │   │   └── test
│   │   │   │       ├── TEST-inheritance.LibraryTest.xml
│   │   │   │       └── binary
│   │   │   │           ├── output.bin
│   │   │   │           ├── output.bin.idx
│   │   │   │           └── results.bin
│   │   │   └── tmp
│   │   │       ├── compileJava
│   │   │       │   └── previous-compilation-data.bin
│   │   │       ├── compileTestJava
│   │   │       │   └── previous-compilation-data.bin
│   │   │       └── test
│   │   ├── build.gradle
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── inheritance
│   │       │   │       ├── Library.java
│   │       │   │       ├── Restaurant.java
│   │       │   │       ├── Review.java
│   │       │   │       ├── Shop.java
│   │       │   │       └── Theater.java
│   │       │   └── resources
│   │       └── test
│   │           ├── java
│   │           │   └── inheritance
│   │           │       └── LibraryTest.java
│   │           └── resources
│   └── settings.gradle
└── linter
    ├── README.md
    ├── app
    │   ├── build
    │   │   ├── classes
    │   │   │   └── java
    │   │   │       ├── main
    │   │   │       │   └── linter
    │   │   │       │       └── App.class
    │   │   │       └── test
    │   │   │           └── linter
    │   │   │               └── AppTest.class
    │   │   ├── generated
    │   │   │   └── sources
    │   │   │       ├── annotationProcessor
    │   │   │       │   └── java
    │   │   │       │       ├── main
    │   │   │       │       └── test
    │   │   │       └── headers
    │   │   │           └── java
    │   │   │               ├── main
    │   │   │               └── test
    │   │   ├── reports
    │   │   │   └── tests
    │   │   │       └── test
    │   │   │           ├── classes
    │   │   │           │   └── linter.AppTest.html
    │   │   │           ├── css
    │   │   │           │   ├── base-style.css
    │   │   │           │   └── style.css
    │   │   │           ├── index.html
    │   │   │           ├── js
    │   │   │           │   └── report.js
    │   │   │           └── packages
    │   │   │               └── linter.html
    │   │   ├── resources
    │   │   │   └── main
    │   │   │       ├── empty.js
    │   │   │       ├── gates.js
    │   │   │       ├── testManyError.js
    │   │   │       ├── testNoError.js
    │   │   │       ├── testOneError.js
    │   │   │       └── testSomeError.js
    │   │   ├── test-results
    │   │   │   └── test
    │   │   │       ├── TEST-linter.AppTest.xml
    │   │   │       └── binary
    │   │   │           ├── output.bin
    │   │   │           ├── output.bin.idx
    │   │   │           └── results.bin
    │   │   └── tmp
    │   │       ├── compileJava
    │   │       │   └── previous-compilation-data.bin
    │   │       ├── compileTestJava
    │   │       │   └── previous-compilation-data.bin
    │   │       └── test
    │   ├── build.gradle
    │   └── src
    │       ├── main
    │       │   ├── java
    │       │   │   └── linter
    │       │   │       └── App.java
    │       │   └── resources
    │       │       ├── empty.js
    │       │       ├── gates.js
    │       │       ├── testManyError.js
    │       │       ├── testNoError.js
    │       │       ├── testOneError.js
    │       │       └── testSomeError.js
    │       └── test
    │           ├── java
    │           │   └── linter
    │           │       └── AppTest.java
    │           └── resources
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    └── settings.gradle
```