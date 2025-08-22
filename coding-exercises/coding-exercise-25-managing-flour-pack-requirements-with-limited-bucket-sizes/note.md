## Coding Exercise 25: Managing Flour Pack Requirements With Limited Bucket Sizes

```java

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        if(bigCount < 0) return false; 
        if(smallCount < 0) return false; 
        if(goal <= 0) return false; 
        
        if(bigCount * 5 + smallCount < goal)
            return false;
        
        while(bigCount > 0 && goal > 5) {
            goal -= 5; 
        }

        if(smallCount < goal) return false; 
        
        return true;
    }
}
```