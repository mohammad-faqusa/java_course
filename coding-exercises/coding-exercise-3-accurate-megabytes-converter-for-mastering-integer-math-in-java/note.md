## Coding Exercise 3: Accurate MegaBytes Converter For Mastering Integer Math In Java

```java
public class MegaBytesConverter {
    // write code here
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes/1024; 
        int remainedBytes = kiloBytes % 1024; 
        System.out.print(kiloBytes + " KB = " + megaBytes +  " MB and " + remainedBytes + " KB");
    }
}
```