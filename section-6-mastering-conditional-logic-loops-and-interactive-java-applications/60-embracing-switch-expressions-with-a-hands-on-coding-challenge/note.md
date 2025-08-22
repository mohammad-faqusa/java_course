## 60. Embracing Switch Expressions With A Hands-On Coding Challenge

### A switch Expression Challenge 
* we will use enhanced switch expression 


#### Day of the Week Challenge 
1. create a methdo called printDayOfWeek
2. takes parameter called day 
3. use enhanced swithc statement, 0 -> sunday ... 

```jshelllanguage
public static void printDayOfWeek(int day) {
    
    String dayOfWeek = switch(day) {
        case 0 -> "sunday" ;
        case 1 -> "mondey" ;
        case 2 -> {yield "tuseday"; }
        case 3 -> "wedenisday" ;
        case 4 -> "thursday" ;
        case 5 -> "friday" ;
        case 6 -> "saturday" ;
        default -> "invalid";
    };
    System.out.println("The day of week : " + dayOfWeek);
}

```