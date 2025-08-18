## 40. Java Operator Precedence: Mastering Expression Evaluation and Challenge

### instance of operator 

### java operators presedence in table 
* search in google 

#### Challenge 
1. create a double varaible , 20.00
2. second variable with 80.00
3. add both 
4. use remainder operator 
5. create boolean variable, that assign true if step 4 return 0
```java
public static void main(String[] args) {
    double myFirstVar = 20.00; 
    double secondVar = 80.00; 
    double sum = myFirstVar + secondVar;
    int remained = sum % 40; 
    boolean isRemainder = (remained == 0) ? true : false; 
    if(isRemainder){
        System.out.println("got some remainder");
    }
}
```