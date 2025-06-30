```java
        int newValue = 50;

        if(newValue = 50){
            System.out.println("This is an error");
        }
```

```java
        boolean isCar = false;
        if(isCar){
            System.out.println("this is not supposed to happen");
        }
```

```
        boolean isCar = false;
        if(isCar = true){ // logical error
            System.out.println("this is not supposed to happen");
        }
	// output : this is not supposed to happen
```
