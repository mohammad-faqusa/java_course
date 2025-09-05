### Generlic Class Challenge part 2 

### the tasks : 
1. create new class Park extends point 
    * fields 
      * String name 
    * consturctor (String name, String location) 
    * methods : 
      * toString : super  + "National Park" 
2. create class River 
   * fields : 
     * String name 
   * constructor (name, String... locations)
   * methods : 
     * toString 
3. create Layer class 
   * generic just with Mappable classes 
   * fields 
     * generic : listElements 
   * constructor (T[] layerElements) 
     * intialize the list with ArrayList 
   * methods 
     * addElements(T... elements) 
       * use addAll 
     * renderLayer() 
     
4. go to Main class 
   * initialize array of Parks, passing values directly 
   * create Layer of type Park, and pass the array of Parks 
   * call render layer
   * create an array of rivers 
   * create river layer 
   * render river layer