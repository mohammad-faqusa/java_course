## ternary operator

**operand ? operand : operand**

```java
        String makeOfCar = "Volkswagen";

        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true ;
        System.out.println(isDomestic); // false
```

## ternary operator ?:

like if-then-else statement

consider this example

```java
        int ageOfClient = 20;

        String ageText = ageOfClient >= 18 ? "Over eighteen" : "Still a kid";

        System.out.println(ageText); // Over eighteen
```

so the result from the ternary operator can be any datatype
