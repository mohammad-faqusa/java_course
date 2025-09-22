## 230. Designing Immutable Classes: Private Final Fields, Defensive Copies - Part 1

#### notes : 


#### immutable object
* does not change state 
* can't maliciously or mistakenly alter it 
* cocurrencty design 

#### Stratigies for creating class, to produce immutable objects 
* make instance feilds fields private and final 
* do not define any stter methods 
* create defensive copies in any getteres 
* use a constructor or factory method to set data making copies of mutable reference data 
* mark the class final or make all constructors private 

#### the process 
1. create new rpject ImmutableClass 
2. create class Person
   * fields 
   * getters/setters
   * toString 
3. create new 3 people and assign as kids 
4. create 3 instances of Person 
5. create array of persons 
6. create instance with kids of (array of persons)
7. getKids 
8. john.setKids(kids); 

#### create preson record
* name, dob, kids 
* generate constructor (custom) 
* 

##### create new class MainRecord 

##### records 
* it has private final 
* no setters 
* but needs additional defensive copy 
