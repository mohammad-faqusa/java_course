## 48. Comprehensive Recap Of Java Methods

### introduction 
* summarize from previous lectures 

#### the method
* define method : ... 
* is method expression or statement
* what are functions and procedures 
  * procedures: is like a method returns nothing 
* declaring the method 
  * declaring modifiers : `public ` and `static`
  * return type : `void`, `int`, ...
    * use one return statement 
  * camal case 
  * method body {} 
* declaring the parameters 
* declaring return type : 
  * void is valid return type, and means no data is returned 
* if method has **return type** 
  * then required to to type return at any exit point
  * wrong method : 
    ```jshelllanguage
    // not valid method : 
    public static boolean calcuateAge(int year) {
        
        if(year < 2000) {
            return age; 
        }
    }
    // this method is valid 
    public static int  calcuateAge(int year) {
        int age = 2025 - year; 
        if(year < 2000) {
            return age; 
        }
        return age; 
    }
    ```
* return type to `void`
  * to terminate the void at special case 
    ```jshelllanguage
    public static void calcuateAge(int year) {
    
        if (year < 2000) {
            return age;
        }
    }
    ```
    
#### the method signature 
* multiple methods wit the same name, 
* differs in parameters type 


#### default values for parameters 
* java does not support it 

#### revisiting the main method 
* after solid knowledge in methods structure, we can revisit method `main`
* main method is special 
  * jvm looks for main method to start the program
```jshelllanguage
public static void main(String[] args) {
    
}
```
* args : command line arguments if they are passed in command line 

#### intellig hins 
* snippets 
  * main : psvm 
* you can click or search for tips in IntelliJ 