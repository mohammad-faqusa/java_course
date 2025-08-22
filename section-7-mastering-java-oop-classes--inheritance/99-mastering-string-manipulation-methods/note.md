## 99. Mastering String Manipulation Methods

### String Comparison Methods

| method                                            | description                                                                                                                                                                                                        |
|---------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| indent                                            | this method was added in JDK 15, and adds or removes spaces from the beginning of lines in multi-line text                                                                                                         |
| strip<br/>stripLeading<br/>stripTrailing<br/>trim | the difference between the strip method and trim method is that the strip() supports a larger set of white space characters. It and the corresponding stripLeading and stripTrailing methdos were added in JDK 11. |
| toLowerCase<br/>toUpperCase                       | Returns a new String, either in a low case or in upper case                                                                                                                                                        |  

* the second set of string manipulation methods transforms the String value and returns a String with a different
  meaning than the original String

| method                                  | description                                                                                                         |
|-----------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| concat                                  | similar to the plus operator for strings, it concatenates text to the String and returns a new String as the result |
| join                                    | allows multiple strings to be concatenated together in a single method, specifying a delimiter                      |
| repeat                                  | returns the String repeated by the number of times specified in the argument                                        |
| replace<br/>replaceAll<br/>replaceFirst | these methods replace characters or strings in the string, returning a new String with replacements made            |
| substring<br/>subSequence               | these return a part of the String, its range defined by the start end end index specified                           |   

### the process 
1. create new class `StringMethods`

```java
public class StringMethods {

    public static void main(String[] args) {
        
        String birthDate = "30/05/2002"; 
        int startingIndex = birthDate.indexOf("2002");
        System.out.println("starting Index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month= " + birthDate.substring(3,5)); 
        
        String newDate = string.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);
        
        newDate = "25"; 
        newDate.concat("/"); 
        newDate.concat("11"); 
        newDate.concat("/"); 
        newDate.concat("2002");
        System.out.println("new date : " + newDate);
        
        newDate = "25" + "/" +  "11" + "/" + "1982";
        System.out.println("new date : " + newDate);
        
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));
        
        System.out.println(newDate.replaceFirst('/', '-')); // just replace the firs occur 
        
        // repeaet 
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));
        
    }
}
```