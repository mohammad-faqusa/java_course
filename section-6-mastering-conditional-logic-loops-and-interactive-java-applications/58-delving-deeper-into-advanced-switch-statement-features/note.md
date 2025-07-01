enhanced switch statement :

```java
public class Main {
    public static void main(String[] args) {

        int value = 3;

        switch (value) {
            case 1 -> System.out.println("the number is one");
            case 2 -> System.out.println("the number is two");
            case 3, 4, 5 -> {
                System.out.println("the number is " + value);
                System.out.println("the number is " + value);
            }
            default -> System.out.println("None");
        }
    }
}

```

## get quarter by writing in traditional switch :

```java
    public static String getQuartier(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4rth";
            default:
                return "None";
        }
    }
```

## quarter with enhanced switch :

```java
    public static String getQuartier(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4rth";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
```
