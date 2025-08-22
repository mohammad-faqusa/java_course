## 95. Using this and super for Constructors

### this vs super 

* super : is used to access parent class members 
* this : is used to curren class members 
* this : is required when we have a parameter with the same name as an instance variable 
* super : is commonly used with method `override`

#### this() vs super() call 
* this() : use to call a constructor from another overloaded constructor in the same class 
* this() : can only be used in a constructor, and it must be the first statement in a constructor
* it is used in constructor chaining 
* super() : must be the first statement in each constructor 
* never have calling both `super()` or `this()` in the same constructor

#### Constructors Bad example 
* each overloaded constructor is independent and does not call another constructor

#### constructor good exmaple 
* constructor chaining 

