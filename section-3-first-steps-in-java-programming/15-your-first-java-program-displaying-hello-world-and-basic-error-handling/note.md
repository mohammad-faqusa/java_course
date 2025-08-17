## 15. Your First Java Program: Displaying 'Hello World' and Basic Error Handling

### Getting started 
* in this video we are going to paring something 
* JShell tool, is the tool currently to achieve this 
* the working segments (solutions) are available in the resources of the video 

### Printing 'Hello World' 
1. go to command line 
2. type `jshell`

```java
System.out.println("hello world");
```

#### Statement 
* what is a statement ?  
it's a complete command to be executed. it can include one or more expressions 
* `System.out.println("hello world");`  
what we've typed above, is a command to print some information to the screen

### Challenge 
* print instead of `Hello World` to `Hello Mohammad`

#### solution 
* git the command from jshell history, (up arrowkey), 
* change the `world` to `mohammad`

#### Jshell typing 
try to type incomplete command then press enter : 
```jshelllanguage
jshell> System.out.println("hello world"
   ...> );
hello world

```
but if we forgut the double quote, we will get an error : 
```jshelllanguage
jshell> System.out.println("hello world
...> );
|  Error:
|  unclosed string literal
|  System.out.println("hello world
|                     ^

```

##### Character literal error : 
```jshelllanguage
jshell> System.out.println('hello world'
    ...> );
    |  Error:
    |  unclosed character literal
    |  System.out.println('hello world'
    |                     ^

```

### summary 
* control keys to exit from current command : ctrl + d , ctrl + c 
* /exit , /ex : to exit from jshell 
* 