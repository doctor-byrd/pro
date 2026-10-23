# Spring Template App


## Run

Run the app:
```sh
./gradlew bootRun
```

Note because the app uses Spring Security, by default all endpoints will be locked down, look for a log that looks like the following:
```sh
# Note the actual UUID-STRING will be different each time the app restarts
Using generated security password: 451c2bd0-ebec-4f00-a765-f7a5ee37dbdc
```

If you visit `http://localhost:8085/swagger-ui.html` you can login with `user` `UUID-STRING`.

## Build

To add a new package visit the [Maven Repository](https://mvnrepository.com/repos/central) select your package then upgrade the `build.gradle.kts` file:
```java
dependencies {
    // ... your existing dependencies are here ...
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.postgresql:postgresql")

    // ADD YOUR NEW PACKAGE HERE:
    implementation("io.jsonwebtoken:jjwt-api:0.12.5")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.12.5")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.12.5") 
}
```
