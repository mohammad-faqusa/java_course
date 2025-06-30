[java summary of operators ](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)

[Java Operator Precedence Table](https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)

## challenge

```java
        double myDoubleNumber = 200;
        double mySecondDoubeNumber = 80;

        double sum = (myDoubleNumber + mySecondDoubeNumber) * 100 ;
        System.out.println("The sum is " + sum);
        double remainder = sum % 40 ;
        System.out.println("this is remainder : " + remainder);

        boolean notRemained = remainder == 0;

        System.out.println("not remained : " + notRemained);

        if(!notRemained){
            System.out.println("Got some remainder");
        }

//        output :
//        The sum is 28000.0
//        this is remainder : 0.0
//        not remained : true
```
