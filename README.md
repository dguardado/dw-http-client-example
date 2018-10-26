# Example

How to start the Example application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/app.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

You can check the greeting client against the example basic auth server on heroku.

To talk to the example server, set the following environment variables:

```shell
GREETING_BASE_URI=https://dw-basic-auth-example.herokuapp.com/
GREETING_USERNAME=Anyone
GREETING_PASSWORD=P@ssw0rd!
```

Or you can set the following config in config.yml:

```yaml
greetingClient:
  baseUri: https://dw-basic-auth-example.herokuapp.com/
  username: Anyone
  password: P@ssw0rd!
```

Health Check
---

To see your applications health enter url `http://localhost:8080/admin/healthcheck`
