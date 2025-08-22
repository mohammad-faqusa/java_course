## 69. Exploring Local Variables And Scope In Java Blocks

### local variables and scope 

* local variable : is available for use by the code block in which it was declaredd 
```jshelllanguage

int firstVariable = 5;
int secondVariable = 10;

if(firstVarialbe > 0) {
    int thirdVariable = 15;
    System.out.println(thirdVariable);
}
}
```

#### scope 
* the scope describes the accessibility of a variable 
* "in scope" means the variable can be used by an executing block or any nested blocks 
* "out of scope" means the variable is no longer available and cannot be used 

#### where are local variables in scope ? 
* they are in scope in the block they are declared 
* they are also in scope for any nested blocks or blocks contained within the outer block 

#### when are local variables out of scope ? 
```jshelllanguage
public static void aMethod(boolean aBoolean) { // the method block 
    if(aBoolean) { // if statement block
        int myCounter = 10;
    }
    System.out.println(myCounter); // my counter is out of scope here
}
```

#### Scope Best Practise 
* to declare and initialize variables in the same place, if possible 
* and to declare variables in the narrowest scope possible 

#### local varaibles in for loop statements 
we declare a variable here isnt accessable outside the for loop  
this is because any variables declared in the init section are local to the loop, meaning they exist and are accessible in memory only **while the loop is executing** , and only to the **loop code block** 
```jshelllanguage
{
    for(int i = 0; i < 10; i++) {
        System.out.println(i);
    }
    System.out.println(i); // i is out of scope here;
}
```

#### Declaring variables in a switch statement block 
* localvaraibles declared in an **if** statement block are not accessible outside of that block 

```jshelllanguage
if(counter > 0) {
    int i = 10; 
} else {
    System.out.println(i); // i is out of scope here;;
}

System.out.println(i); // Error , i is out of scope here ; 
``` 

#### Declaring variables in a switch statement block 
* is different from if-then-else block 
* i accessible but only after the declaration and initialization 
```jshelllanguage
public static void aMethod(int aNumber) {
    switch(aNumber) {
        case 1:
            int i = 10;
            break;
        case 2:
            System.out.println(i); // this is ok 
            break;
    }
}

```