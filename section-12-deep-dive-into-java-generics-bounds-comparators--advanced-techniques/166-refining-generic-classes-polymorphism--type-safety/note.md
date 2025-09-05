## 166. Refining Generic Classes: Polymorphism & Type Safety

### solutions : 
1. duplicate code 
2. use player interface , the teamMembers is list of Player 

#### task 
1. in main class, create interface Player 
2. replace every baseballPlayer to Player 
3. the record BaseBallPlayer implements Player 
4. create two objects baseball team, and call the scoreResult 
5. create two SportTeam Objects, and compare with scoreResult 
6. create footBAllPlayer record


### generic type parameters 
* can have on or more T parameters 
```jshelllanguage
public class Team<T1,T2,T3> {
    
}
```
#### task 
* create class Team<T> 
* replace the objects and methods to type T 

#### raw usage of generics : 
* intellij highlight the objects of Team, to declare generics 
* ## 166. Refining Generic Classes: Polymorphism & Type Safety
