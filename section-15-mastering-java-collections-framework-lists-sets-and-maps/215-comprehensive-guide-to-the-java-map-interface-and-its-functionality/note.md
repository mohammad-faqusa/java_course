## 215. Comprehensive Guide to the Java Map Interface and Its Functionality

#### Notes on Maps 
* Maps are different from sets in insertions
* when add element to set , it returns true if the element was not exist otherwise return false 
* but map when adding element (put) , it will add if there is no key, and replace with new value if there was a key 

* **get** return the element if found, otherwise null 
* **getOrDefault** return element if found, otherwise the element passed to second args 

##### put and putIfAbsent difference 
