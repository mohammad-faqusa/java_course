## 162. Interface Challenge (Part 1): Creating Mappable Classes & GeoJSON-Like Output

### the interface challenge 

#### map categories : 
* point 
* line or a polygon
* geometric shape 

#### result 
* text could be printed to a file
* the format : JSON 

##### objective 
create a String for every feature 
```json
{"properties": {"name": "sydney opera house", "usage":"entertainment"}}
```
* create mappable interface : 
  * implement 3 methods 
    * return label (item description on the map)
    * return geometry type (POINT or LINE) 
    * icon type 
  * constant string JSON_PROPERTY , equal to `"properties":{%s}`
  * default method called `toJSON` print out : 
    * type, label, and the marker 
  * static method : 
    * argument : mappable instance 
    * print out tthe properties for each mappable type 

##### two classes implements the interface
1. Building 
2. UtilityLine
Building => has geometry type of POINT , 
UtilityLine => geometry type of LINE 

##### example of building 
```json
{"properties" :  {"type":  "POINT", "label":  "Sydney town hall", "marker" :  "RED START", "usage": "GOVERNMENT"}}
```

#### solution 
1. create interface project
2. create new class `Mappable`
   1. create JSON_PROPERTY  the value is json format `properties`, in multi line interface 
   2. greate getLabel() 
   3. return string

