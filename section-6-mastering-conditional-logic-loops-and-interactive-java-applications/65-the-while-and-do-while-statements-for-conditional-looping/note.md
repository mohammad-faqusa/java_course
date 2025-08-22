## 65. The while And do-while Statements For Conditional Looping

### other ways to loop 
* with not associated range of values 

### java has two types of while loops 
| while loops | explanation                                                                                 |
|-------------|---------------------------------------------------------------------------------------------|
| while       | continue executing code block until the loop expression become false                        |
| do while    | execute the code block once, then continue executing until the loop condition becomes false |   

```java
public class Main {

    public static void main(String[] args) {
        
        int j = 1 ;
        while (j <= 5) {
            System.out.println(" j " + j);
            j++; 
        }
        
        int j = 0; 
        while(true){
            if(j > 5)
                break; 
            System.out.println( );
            j++; 
        }
        
        int  j = 1; 
        boolean isReady = false;
        while(!isReady){
            if(j  >= 5 )
                isReady = true; 
            System.out.println(" j " + j);
            j++;
        }
        
        int j = 10; 
        do {
            if(j  >= 5 )
                isReady = true;
            System.out.println(" j " + j);
            j++;
            
        }while(!isReady); // will print "j 10" 
    }
}
```

#### continue 
* stop executing at current iteration 

