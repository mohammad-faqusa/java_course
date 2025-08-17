## 16. Introduction to Variables, Keywords, and the Integer (int) Data Type

### Java keywords
* [keywords webstie](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9)

#### Some java kewords 
* you don't need to memorize all keywords 
* the main keywords we use :  
(data types) : boolean, double byte, char, int, short , float , long

### Variables 
* variables is a way to store information in our computer 
* can be accessed by a name we give them , and computer does the hardwork (where stored in **random access memory**)

#### Datatype 
* there is a lots of datatypes of data, that were define for our variables 
* there is **keywords** datatypes, and you can design **your own** datatype 

### Jshell 
```jshelllanguage
int myFirstNumber = 5; 

```
* we specified the data type `int`,
* varaible name: `myFirstNumber`
* the stored value : `5`
* statement : `int myFirstNumber = 5; `

#### Declaration statement : 
* is used to define a **variable** by indicating the **data type**, and the **name**, then **optionally** to set the variable to a **specific value** 

#### Expression 
* what is an expression ?  
is a coding **construct, that evaluates to a single value** 

#### Challenge 1 
* print the value that is assigned to varaible `myFirstNumber`

```jshelllanguage
jshell> int myFirstNumber = 5;
myFirstNumber ==> 5

jshell> System.out.println("myFirstNumber");
myFirstNumber

jshell> System.out.println(myFirstNumber);
5
```
* lets reassign the variable to new value 
```jshelllanguage
jshell> myFirstNumber =10;
myFirstNumber ==> 10

jshell> System.out.println(myFirstNumber);
10
```

#### Challenge 2 
* change the value of `myFirstNumber` from ten to ten thousands 
```jshelllanguage
jshell> myFirstNumber =10000;
myFirstNumber ==> 10000

jshell> System.out.println(myFirstNumber);
10000
```

* list the commands in jshell 
```jshelllanguage
jshell> /list

    1 : System.out.println("myFirstNumber");
    2 : int myFirstNumber = 5;
    3 : System.out.println("myFirstNumber");
    4 : System.out.println(myFirstNumber);
    5 : myFirstNumber =10;
    6 : System.out.println(myFirstNumber);
```

#### Variable declaration in JShell 
* by declaring a variable again, we are effectively **re-declaring a variable**,
* but in **java programming** that would **not be allowed** , and throw an error 
* due to **interactive nature**, JSell "holds our hand"

#### assign sum operation 
```jshelllanguage
jshell> myFirstNumber =10 + 5;
// myFirstNumber ==> 15

jshell> myFirstNumber =(10 + 5) + (2 * 10);
// myFirstNumber ==> 35
```

#### Operators 
* perform an operation (hence the term) on a variable or value 
* addition, subtraction, division ...


