## the POJO vs. The Record

its the code that's repetitive and follows certain rules

## record

replace the boilerplate code of the POJO but to be mroe restrictive

java calls them "plain data carriers"

## implicit or Generated Code that Java provides

the parameters of **record** automatically created in fields (declared with **final and private**)

sometimes referred to **component field**

java generated **toString** method

public accessors , has same name of component name

```java
        Student pojoStudent = new Student("123123" , "Ann", "30/12/2000", "Java master class");
        LPAStudent recordStudent = new LPAStudent("1231232", "Bill", "18/2/2001", "Java master class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is talking to " + recordStudent.name());
```

## why have an immutable record?

## POJO vs. Record
