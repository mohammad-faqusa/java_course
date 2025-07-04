## plain old java object

a class that has only **instance fields**

also might be called a bean of a JavaBean

## annotation

a type of metadata

to describe additional info about our code

can be used by **compiler , or other types of pre-processing**

## overriden method

## implicit call methods : toString :

```java
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("1234" + i,
                    switch (i) {
                        case 1 -> "Mohammad";
                        case 2 -> "Ahmad";
                        case 3 -> "Ali";
                        case 4 -> "Sharbel";
                        case 5 -> "Ehsan";
                        default -> "Anonymous";
                    },
                    "30/5/2002",
                    "Java master class");
            System.out.println(s); // print toString method if defined, else print the address of instance
        }
```

```bash
output :
Student{id='12341', name='Mohammad', dataOfBirth='30/5/2002', classList='Java master class'}
Student{id='12342', name='Ahmad', dataOfBirth='30/5/2002', classList='Java master class'}
Student{id='12343', name='Ali', dataOfBirth='30/5/2002', classList='Java master class'}
Student{id='12344', name='Sharbel', dataOfBirth='30/5/2002', classList='Java master class'}
Student{id='12345', name='Ehsan', dataOfBirth='30/5/2002', classList='Java master class'}
```
