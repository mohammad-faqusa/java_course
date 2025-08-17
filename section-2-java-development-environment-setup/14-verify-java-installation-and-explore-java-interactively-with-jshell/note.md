## 14. Verify Java Installation and Explore Java Interactively with JShell

### Links 
* [Introduction to JShell](https://docs.oracle.com/en/java/javase/17/jshell/introduction-jshell.html#GUID-630F27C8-1195-4989-9F6B-2C51D46F52C8)


### Code in Notepad 
* you could use a simple text editor to write java code. 
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
```
* but you need to compile and execute java manually 

### Intellig IDE 
* IDE : integrate development environment 
* is the most common used method 
* powerful tool 
  * makes code read, and run easily 

### Command Terminal 
* you can execute java files on cmd 
```bash
java -version 

#java commands 
```

### JShell 
* becomre standard component of jdk in java 9 
* `Read-Eval-Print-Loop` interactive program (REPL for short) 
  * it reads the command or code segment we type in 
  * evaluates and executes code, and often allows short cuts to be used
  * prints out the results of the evalucation or execution, without making the developer write code to output the results 
  * loops right back for more input 
* is useful for quickly trying out new ideas 

#### JShell guide 
* [Introduction to JShell](https://docs.oracle.com/en/java/javase/17/jshell/introduction-jshell.html#GUID-630F27C8-1195-4989-9F6B-2C51D46F52C8)

#### back to cmd 
```bash
jshell 
/help intro 
```
```jshelllanguage
/help intro 

/list -all // to list all libraries

```
* jshell history commands , are reached by arrows on keyborad

* to run mitliple codes (open brackets)
```jshelllanguage
{
    
}
```

* command to exit the jshell : `/exit `

### Where's the java code 
* have good reason why introduce to jshell first 
* first java code is very traditional program for a beginner, 
* I wanted to get all teh JShell commands and usage out of the way 
