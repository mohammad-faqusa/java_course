## 64. for Loop Recap And Key Takeaways For Iteration In Java

### the code structure 
```jshelllanguage
for (int i = 0; i < 10; i++) {
    System.out.println("number = " + i);
}
```
* semicolons are required between parameters, even if parameters does not exists
```jshelllanguage
int i = 0; 
for (; ;) {
    System.out.println("number = " + i);
    i += 5; 
    if(i >= 20)
        break; 
}
```