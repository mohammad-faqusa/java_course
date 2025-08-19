## Coding Exercise 12: Designing A 'Playing Cat' Logic Program To Refine Conditional Implementation

```java
public class PlayingCat {
    // write code here
    public static boolean isCatPlaying(boolean isSummer, int temperature){
    
        return isSummer ? temperature >= 25 && temperature <= 45 : temperature >= 25 && temperature <= 35; 
    }
   
}
```