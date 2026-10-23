# Spring Template App


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