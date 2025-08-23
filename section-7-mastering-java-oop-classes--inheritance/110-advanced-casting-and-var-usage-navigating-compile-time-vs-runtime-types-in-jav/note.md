## 110. Advanced Casting and var Usage: Navigating Compile-Time vs. Runtime Types in Jav

### the process
1. in previous project 
2. create new class `NextMain`
```java
public class NextMain {
    public static void main(String[] args) {


        Movie comedy = Movie.getMovie("comedy", "because I am happy");
        movie.watchMovie();
        
//        Adventure jaws = Movie.getMovie("A", "Jaws");
        Adventure jaws = (Adveture) Movie.getMovie("A", "Jaws");
        
        Adventure jaws = (Adveture) Movie.getMovie("C", "Jaws"); // class casting exception 
        
        Object comedy = Movie.getMovie("C", "Airplane");
        comedy.watchMovie(); // watch movie is not resolved 

        Object comedy = Movie.getMovie("C", "Airplane");
        Movie comedyMovie = (Movie) comedy; 
        comedyMovie.watchMovie();
        //comedyMovie.watchComdey(); // compile error , this method is not declared in Movie


        var airplance = Movie.getMovie("C", "Airplane");
        
        var plane = new Comedy("Airplance");
        plane.watchComedy(); 
    }
}
```
* lets try declaring with subclass, but using Movie.getMovie, in initialization 
  * can every kind of Movie be assigned to `Adventure` type ?
  * the answer is no 
* this is not valid , compiler error 
```jshelllanguage
Adventure jaws = Movie.getMovie("A", "Jaws");
```
* but we can solve it, by  `Casting`
```jshelllanguage
Adventure jaws = (Adveture) Movie.getMovie("A", "Jaws");
```
* but what if replace "A" with "C" ? 
  * this code is compiles 
  * but when running it : `Class cast exception `
* what is declared with `Object`
  * it just assumes that is just an Object
  * only has access to Object functionality 
  
```jshelllanguage
Object comedy = Movie.getMovie("C", "Airplane");
comedy.watchMovie(); // watch movie is not resolved 
```
* lets prove that by adding another function in sub classes, that the parent class does not have 
```java
class Adventure extends Movie {
    // .... 
    
    public void watchAdventure() {
        System.out.println("Watching an Adventure");
    }
}

class Comedy extends Movie {
    // .... 

    public void watchComedy() {
        System.out.println("Watching a comedy ");
    }
}

class ScienceFiction extends Movie {
    // .... 

    public void watchScienceFiction() {
        System.out.println("Watching a ScienceFiction");
    }
}
```

* to execute this command : 
  * lets cast using Movie declaration , becuase Object is too generic 
```jshelllanguage
Object comedy = Movie.getMovie("C", "Airplane");
Movie comedyMovie = (Movie) comedy
comedyMovie.watchMovie(); // run 
//comedyMovie.watchComdey(); // compile error , this method is not declared in Movie

```
* in order to run `watchComdey()` , we need to cast into more specific type : Comedy 
```jshelllanguage
Object comedy = Movie.getMovie("C", "Airplane");
Movie comedyMovie = (Comedy) comedy
comedyMovie.watchComdey(); 
```

#### what is var ? 
* var is special contextrual keyword in Java that lets our code take advantage of Local Variable Type inference 
* by using var as the type, we're telling Java to figure out the compile-time type for us. 

```jshelllanguage
var airplance = Movie.getMovie("C", "Airplane"); // MOvie type
```

```jshelllanguage
var plane = new Comedy("Airplance"); // Comedy type 
plane.watchComedy(); 
```

#### Local varaible tyep inference (LVTI)
* was introduced in java 10
* help readability of code 
* reduce boilerplate 

* it's called Local Variable Type Inference for a reason, because  : 
  * it can't be used in field declarations on a class 
  * it can't be used in method signatures, either as a parameter type or a return type 
  * it can't be used without an assignment because the type can't be inferred in that case 
  * it can't be assigned a null literal again, because a type can't be inferred in that case 

#### Run time vs Compile Time typing 
* you can think of the compile time type as the **declared** type
* a type is declared as a variable reference, a method return type, or a method parameter, for example 
* in this case of Local variable type inference, we don't explicitly declare a type for the compiled reference type, Instead, it gets inferred by the compiler, but the byte code generated is the same as if we had declared the type

* in many cases, the compile time type is declared type to the left of the assignment operator 
* what is returned on the right side of the assignment operator from whatever expression or method is executed, sometimes can only be determined at runtime, when the code is executing conditionally through the statements in the code

* you can assign a runtime instance to a different compile time type, only if certain rules are followed 
  * we looked on the rules : inheritance rule 
* we can assign an instance t oa varaible of the same type, or a parent type, or a parent's parent type, including java.lang.Object ultimate base class 

##### why are runtime types different than compile time tpyes ? 
* because of polymorphism 

