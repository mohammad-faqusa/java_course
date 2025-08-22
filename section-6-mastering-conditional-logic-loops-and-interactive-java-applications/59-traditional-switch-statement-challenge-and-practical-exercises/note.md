## 59. Traditional Switch Statement Challenge And Practical Exercises

### Traditional Switch Challenge 

#### introduction 
what talked in previous video 


#### syntax of both types 
traditional vs enhanced 

#### switch challenge 
* NATO alphabet to  replace acharacter or letter, with NATO's standarized word 

| character | word  |
|-----------|-------|
| A         | Able  |
| B         | Baker |
| H         | How   |
| I         | Item  |
| J         | Jig   |

```jshelllanguage
switch(letter) {
    case 'A':
        System.out.println("Able");
        break;
    case 'B':
        System.out.println("Baker");
        break;
    case 'H':
        System.out.println("How");
        break;
    case 'I':
        System.out.println("Item");
        break;
    case 'J':
        System.out.println("Jig");
        break;
    default :
        System.out.println("None");
        break; 
}
```