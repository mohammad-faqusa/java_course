## 111. Runtime Type Inspection: Mastering instanceof and Pattern Matching in Java

### Evaluating what the runtime type is 
* how can we test the actual runtime type of a variable if its declared type is different 
* We can determine the runtime type of an object in several ways.

##### by using code : 
```jshelllanguage
Object unknownObject = Movie.getMovie("C", "Airplane"); 
if(unknownObject.getClass().getSimpleName() == "Comedy") {
    Comedy c = (Comedy) unknownObject;
    c.watchComedy(); 
} else if (unknownObject instanceof Adveture) {
    ((Adventure) unknownObject).watchAdventure(); 
} else if (unknownObject instanceof ScienceFiction syfy){
    syfy.watchScienceFiction(); 
}
```

#### instanceof operator 
* test the type of an instance or object 
* `unknownObject instanceof Adveture`
* they type you are testing for , is the right operand : `Adveture`

#### instanceof <object name> 
`unknownObject instanceof ScienceFiction syfy`
```jshelllanguage
else if (unknownObject instanceof ScienceFiction syfy){
    syfy.watchScienceFiction(); 
}
```
* here we don't need to write additional code for casting 