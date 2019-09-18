# This is a simple Spring-boot web app with Thymeleaf.

## What you'll need:
- JDK 8+
- Maven 3+
- Springboot

## Step wise procedure:
- Add the project dependencies to pom.xml (in this case Spring-web-starter, Thymeleaf)

- Define Controller Template (Controller maps http requests with view)
	- @RequestMapping maps "/demo" to demo() method.
	- name is a query parameter of /demo request.
	- Model object passes value to demo view(demo.html).

- Define View Template

- Run the project as a Spring boot App

- Your web app will be accessible at "http://localhost:8080/demo"

- Update: Integrated Jenkins.
