## 49. Hands-On Java Method Challenge For Deeper Practice

### method challenge 
* create two methods 
  * `displayHighScorePosition`
    * two parameters : player name, player position 
    * print like : mohammad got position 2 
  * `calculateHighScorePosition`
    * only parameter (player score)
    * return number between 1 and 4 

```java
public class MethodChallenge {

    public static void main(String[] args) {
        int score = 1000; 
        int position = calculateHighScorePosition(score);
        displayHighScorePosition("mohammad" , position);
        
    }
    
    public void displayHighScorePosition(String name , int position) {

        
        System.out.println("The player " + name + " has position " + position );
    }
    
    public int calculateHighScorePosition(int playerScore) {
        
        if(score > 1000) {
            return 1; 
        } else if (score > 500 && score <= 1000) {
            return 2; 
        } else if (score > 100 && score <= 500) {
            return 3;
        } else {
            return 4; 
        }

        // making the code more readable 

        if(score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score > 100) {
            return 3;
        }
        return 4; 
        
        // single return statement 
        
        int position = 4;
        if(score >= 1000) {
            position =  1;
        } else if (score >= 500) {
            position =  2;
        } else if (score > 100) {
            position = 3;
        }
        return position;
        
    }
    
    
}
```