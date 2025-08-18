## 33. Creating Your First IntelliJ Project: 'Hello World' Java Code Implementation

### The process 
1. click on new project
   * project name : HelloWorld 
     * (not recommended with space)
     * use capitalize case 
   * project location 
   * language : java 
   * build system: intellij 
   * project jdk : java 17
   * uncheck add symbol code 
2. create the project
3. right click on `src` folder, and create class `FirstClass`
```java
public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
4. type `psvm` , is shortcut to write main method 
5. type `sout`, is shortcut to print 
6. you notice after running the code
   * the printed `Hello Word`
   * `Process finished with exit code 0`  
   0 is used to indicate success 



#### Naming items in java 
| identifier    | usage          | recommended      | example          |
|---------------|----------------|------------------|------------------|
| project name  | intellij field | upper camel case | FirstJavaProject |
| class name    | java element   | Upper Camel Case | NewClass         |
| method name   | java element   | lower camel case | getData          |
| variable name | java element   | lower camel case | firstVariable    |    

