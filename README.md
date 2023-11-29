# Login-Roles App

This project was made as a one of the final projects for [OOP course](https://todocodeacademy.com/course/programacion-orientada-a-objetos-con-java/) from TodoCode.
I used:
- Java 11
- EclipseLink 2.2 as the JPA provider
- MySQL
- Swing for the user interface

I use layered architecture dividing the app in User Graphic Interface, the Logic and the Persistence.
The app is a simple login with manual authentication where each user, depending on his role, can access diferent functionalities.

To run the project you can follow this steps:
- Clone the repository
- Configure your database credentials in `./src/main/resources/META-INF/persistence.xml`
- Run `mvn clean package`
- Run `java -cp .\target\Login-1.0-SNAPSHOT.jar com.mycompany.login.Login`

##### Considerations:
In order to run the project, you need [JDK 11](https://www.oracle.com/ar/java/technologies/javase/jdk11-archive-downloads.html) and [maven](https://maven.apache.org/index.html)
