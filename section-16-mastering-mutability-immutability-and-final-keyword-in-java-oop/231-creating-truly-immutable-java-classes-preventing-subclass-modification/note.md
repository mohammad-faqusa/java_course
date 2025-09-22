## 231. Creating Truly Immutable Java Classes: Preventing Subclass Modification

#### notes : 
* immutable assigning 
* immutable inheritance by creating get method returns a copy of the mutable variable,  
and it should be final to not allow for alter process in sub classes 

#### the strategies 
* private 
* final
* eliminate setters 
* create defensive copies 

##### defensive copies 
* getKids 

##### constructors 
assign copy of mutalbe object 



#### the process 
1. create personImmutable 
2. replace personrecord with personimmutable 
3. create protected constructor 
4. change to protected kids feild 
5. use getDob() instead of dob, to allow override 
6. create LivingPerson extends PersonImmutable 
7. 