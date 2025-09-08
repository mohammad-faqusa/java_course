## 181. Local Classes: Scoping & Effective-Final Variables

* are inner classes 
* declared directly in code block, usually a method boyd 
* they don't have access modifiers 

### the process : 
* in NestedClasses, Main class 

```java

```
in main main method : 
```java
public class Main {

    public static void main(String[] args) {
        addPigLatinName(employeeList); 
        
    }
}

public class Main {

    public static void addPigLatinName(List<? extends StoreEmployee> list) {

        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee>{

            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() +  " " + pigLatinName;
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for(var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }

        for(var decoratedEmployee : newList) {
            System.out.println(decoratedEmployee);
        }
    }
}
```