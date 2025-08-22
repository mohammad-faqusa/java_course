## 58. Delving Deeper Into Advanced Switch Statement Features

### More switch statement 


#### back to switch code 
* if you have on `switch` on intellij , you can switch to **enhanced switch** 

Traditional Switch Statement
```jshelllanguage
int switchValue = 1;

    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
//            break;
        case 2:
            System.out.println("Value was 2");
//            break;
        case 3:
            System.out.println("Value was 3");
//            break;
        case 4: case 5: case 6:
            System.out.println("higher a bit");
//            break;
        default:
            System.out.println("not 1 or 2 or 3");
            break;
    }
```

Enhanced switch statement
```jshelllanguage
switch(switchValue) {
    case 1 -> System.out.println("Value was 1");
    case 2 -> System.out.println("Value was 2");
    case 3, 4, 5 -> {
        System.out.println("Value was 3 4 5");
        System.out.println("Actually it was a " + switchValue);
        
    }
    default -> System.out.println("Neither of known numbers");
}
```
* the colon has been replaced to arrow token 
* there are no break statements in enhanced switch statement 

```jshelllanguage
public static String getQuarter(String month) {
    
    String result = switch(month) {
        case "january", "february", "march" -> "1st"; 
        case "april", "may", "june", "july" -> "2nd";
        default -> {
            String badResponse = month + " is bad" ;
            yield badResponse; 
        }
    };
    return result; 
}
```
* in enhanced statement, the returned value come from single statement return value after the arrow 
  * or the `yeild` in code block 
```jshelllanguage
case "january", "february", "march" -> "1st";
case "april", "may", "june", "july" -> {yield "2nd";}
```
## 58. Delving Deeper Into Advanced Switch Statement Features
