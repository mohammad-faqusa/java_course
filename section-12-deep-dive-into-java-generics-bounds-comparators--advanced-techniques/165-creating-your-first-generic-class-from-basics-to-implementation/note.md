## 165. Creating Your First Generic Class: From Basics to Implementation


### Whar are Generics 
* supports types : classes , record and interface 
* generic class structure :
```java
class YouTllMe<T> {
    private T field; 
}
```
* variable declaration : 
```jshelllanguage
ArrayList<String>listOfStrings
```

### the task : 
1. create project 
2. create record BaseBallPlayer 
3. create class BaseBallTeam
   * name, teamMembers (array of interface type) , totalwins, totalloses, totalties 
   * constructor(team name)
   * methods : 
     * addTeamMember 
     * listTeamMembers 
     * int ranking() : total loses  * 2 + total tries + 1; 
     * String setScore(our score, their score)
     * toString : team name, rank 
4. Main method 
   * create 2 baseball players 
   * create static method (scoreResult) 
   * 