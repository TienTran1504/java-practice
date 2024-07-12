# java-practice

## Steps

### Step 1: Initialize the Database

1. Start by executing the `animal.sql` file to set up your database schema and initial data. You can do this by running the following command in your terminal or command prompt, making sure to replace `username` with your MySQL username and `database_name` with the name of your database:

### Step 2: Build the Application

2. Navigate to the root directory of your project in the terminal or command prompt.

3. Execute the following command to compile the library classes, package them into a JAR file, move the JAR file to the appropriate directory, compile the main application class, prepare the dependencies, package the application into an executable JAR, and finally run the application:

   ```bash
   javac -d library/target/classes library/src/java/com/mylibrary/**/*.java && \
   jar cvf library/target/MyLibrary.jar -C library/target/classes . && \
   mv library/target/MyLibrary.jar main/src/java/com/myapp/lib/ && \
   javac -cp main/src/java/com/myapp/lib/MyLibrary.jar:lib/my-sql-connector-j-9.0.0.jar -d target/classes -sourcepath main/src/java main/src/java/com/myapp/MainClass.java && \
   mkdir -p target/dependency && \
   cd target/dependency && \
   for jarfile in ../../main/src/java/com/myapp/lib/*.jar; do jar xf $jarfile; done && \
   cd ../../ && \
   jar cvfe target/MyApp.jar com.myapp.MainClass -C target/classes . -C target/dependency . && \
   java -jar target/MyApp.jar
   ```

This command performs several actions:

- Compiles the library classes.
- Packages the compiled classes into `MyLibrary.jar`.
- Moves `MyLibrary.jar` to the application's library directory.
- Compiles the main application class with dependencies.
- Extracts the contents of library JARs to the `target/dependency` directory.
- Packages the application and its dependencies into `MyApp.jar`.
- Runs the application.
