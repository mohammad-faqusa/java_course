## 230. Designing Immutable Classes: Private Final Fields, Defensive Copies - Part 1

#### notes : 
* create immutable class with fields to avoid danger alter process from client 
* recommended to use record , with using additional self defence procedures 
* getting field : return a copy of field 
* but still there is dangerous when assigning a field referenced mutable variable (arrays, collections ... ) 
