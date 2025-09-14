## 203. Challenge: Building a Custom Card Game with java.util.Collections

### the process 
1. create rank enum
2. class GameController
3. in card class , create comparator rank reversed suit 
4. create class PokerHand


#### how to play the game : 
on the [following link](https://www.wikihow.com/Play-Five-Card-Draw)

#### rank structure 
ranks : none , one pair , two pair, three of a king, full house, four of a kind 
toString 

#### GameController 


#### PokerHand : 
##### fields : 
* list hand 
* list keepers 
* list discards 
* ranking socre = none 
* playerNo 

##### Constructor 
params : playersNo, List hand 
body : 
* hand.sort
* initialize params 
* keepers 
* discards 

##### methods 
* toString : playersNo, score, score.ordinal, hand, discards, 

#### PokerGame 
* fields : 
  * final deck 
  * int playerCount 
  * cardsInHand 
  * List<PokerHand> pokerHands 
  * list<Card> remainingCards 
* constructor 
  * param : playerCount, cardsInHand 
  * pokerHands = new ArrayList 
* 

## 203. Challenge: Building a Custom Card Game with java.util.Collections
