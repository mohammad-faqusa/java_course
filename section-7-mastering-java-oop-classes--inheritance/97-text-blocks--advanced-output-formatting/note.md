## 97. Text Blocks & Advanced Output Formatting

### what's a text block  ? 
* a text block is just a special format for multi line string literals 
* its simply a String with a new representation in the course code 
* JDK 15 

```java
public class Main{

    public static void main(String[] args) {
        
        String bulletIt = "Print a Bulleted List:" + 
                "\u2022 First Point" + 
                "\u2022 Sub Point";
        System.out.println(bulletIt);
    }
}
```

#### Some common Escape sequences : 
| escape sequence | description                     | 
|-----------------|---------------------------------| 
| \t              | insert a tab character          | 
| \n              | insert a new line character     | 
| \"              | insert a double quote character | 
| \\              | insert a backslash character    | 

```jshelllanguage
String bulletIt = "Print a Bulleted List\n + 
                "\t\u2022 First Point" + 
                "\t\t\u2022 Sub Point";
System.out.println(bulletIt);

String textBlock = """
Print a bulleted list : 
    \u2022 First Point"
        \u2022 Sub Point"
"""
System.out.println(textBlock);
```

```jshelllanguage
int age = 35;
System.out.printf("your age is %d", age);

int yearOfBirth = 2023 - age;
System.out.printf("Age = %d, Birth Year = %d", age, yearOfBirth);
```

#### Format Specifier 
* At their most complex, format specifieres take the form shown here.
* `%[argument_index$][flags][width][.precision]` conversion 
* they start with a percent sign, and end with a conversion symbol, and have lots of options in between 
* I've looked at one conversion type, d, which is the symbol used for a decimal integer value. 

* as shown in the table on [this link](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html)
* as shown some format specifiers 
  * 'd' : integral , the reuslt is formatted as a decimal integer 
  * 'f' : floating point, the reusl is formatted a decimal number 
  * 't', 'T': date/time: prefix for data and time conversion characters 
  * 'n': line separator , the result is the platform-specific line separator 

* lets try insert other specifiers : 
```jshelllanguage
int age = 35;
System.out.printf("your age is %d%n", age);

int yearOfBirth = 2023 - age;
System.out.printf("Age = %d, Birth Year = %d%n", age, yearOfBirth);

System.out.printf("your age is %f%n", age); // you will got exception , illegal format conversion exception 
System.out.printf("your age is %f%n", (float) age); // valid 
```

#### Formatted String 
```jshelllanguage
String formattedString = String.format("your age is %d",age );
System.out.println(formattedString);
```