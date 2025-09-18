## 227. Deep Dive into the Final Modifier: Methods, Fields, Classes, Variables

#### The final modifier in java 
* A final method means it can't be overridden by a subclass
* A final field means an objects field can't be reassigned or given a different value , after its initialization 
* A final static field is a class field that can't be reassigned or given a different value after the calss;s initialization process, afield declared on an interface is always public static and final 
* A final class can't be overridden , meaning no class can use it in the extends clause 
* A final variable in a block of code, means that once it's assigned a vlaue, any remaining code in the block can't change it 
* a final method parameter means that you cna't assign a different vlaue to that parameter in the method code block 

#### Using the final modifier on methods :
You can use the final modifier on methods  
Using final with methods only makes sense in the context of wanting to restrict waht your sublcasses can override or hide  
Using final on an instance method means subclasses can't override it  
Using final on a **class** (static) method means subclasses can't hie it. 

#### The process 
1. create new project (FinalExplored)
2. in dev.lpa create new class **BaseClass** 
```java
public class BaseClass {

    public void final recommendedMethod() {
        System.out.println("[BaseClass.recommendedMethod]: Best Way to Do it"); 
        optionalMethod(); 
        mandatoryMethod(); 
        
    }
    
    protected void optionalMethod() {
        System.out.println("BaseClass.optionalMethod: Customizable and optional");
    }
    
    private void mandatoryMethod() {
        System.out.println("[BaseClass.mandatoryMethod]: Non negotiable");
    }
    
    public static void recommendedStatic(){

        System.out.println("[BaseClass.reocmendedStatic] Best way to do it"); 
        optioanStatic();
        mandatoryStatic(); 
    }
    
    proctected static void optionalStatic() {
        System.out.println("[BaseClass.optionalStatic]: Optional");
    }
    
    private static void mandatoryStatic() {
        System.out.println("BaseClass : mandatory static");
    }
}
```
3. create **ChildClass** in consumer.specific package 
```java
import dev.lpa.generic.BaseClass;
public class ChildClass extends BaseClass{
    @Override 
    protected void optionalMethod() {

        System.out.println("Child:optionalMethod EXTRA stuff here");
        super.optionalMethod(); 
    }
    
    @Override 
    public void recommendedMethod() {
        System.out.println("ChildClass: recommendedMethod");
        super.recommendedMethod() ; 
    }
    
    // how to call non negotiable method 
    
}
```
4. move to Main class 
```java
public class Main {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass(); 
        
        BaseClass childReferredToABase = new ChildClass(); 
        
        parent.recommendedMethod();
        System.out.println("--------------------------------");
        childReferredToABase.recommendedMethod();
        System.out.println("-------------------------------");
        child.recommendedMethod();
        System.out.println("-------------------------------");
        
        parent.recommendedStatic(); // calling static using instant references (not good practice) 
        
    }
}
```

