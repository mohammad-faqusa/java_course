## 163. Interface Challenge (Part 2): Finalizing Mapping Logic & Extended Features

### the process 
1. create class Building 
   * fields : 
     * String name 
     * UsageType usage 
   * constructor (three fields)
2. create UsageType enum : 
   * ENTERTAINMENT, GOVERNMENT, RESIDENTIAL , SPORTS 
3. Buiilding implements mappable 
4. implement methods 
5. create list of Mappable in main method 
6. add buildings 
7. loop and invoke the static mapIt in Mappable interface 
8. override toJSON 
   * add name and usage to super method 
9. create UtilityLine class 
10. create UtilityType enum : {ELECTRICAL, FIBER_OPTIC, GAS , WATER} 
11. UtilityLine class implements mappable  : 
    * fields :  
    string name  
    utilityType type 
    * constructor : two fields 
    * methods : 
      * add name and type to the label 
      * add geometry type to line 
      * add type to getmarker switch case 
    * 