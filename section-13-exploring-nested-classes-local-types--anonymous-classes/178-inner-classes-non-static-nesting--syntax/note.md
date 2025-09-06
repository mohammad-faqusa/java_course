## 178. Inner Classes: Non-Static Nesting & Syntax

### Inner classes 
* non static classes 

### the process 
1. cereate new StoreEmployee class 
```java
public class StoreEmployee extends Employee {
    
    private String store; 
    
    public StoreEmployee() {
        
    }

    public StoreEmployee(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted); 
        this.store = store; 

    }
    
    @Override 
    public String toString() {
        return "%-8s%s".formatted(store, super.toString()); 
    }
    
    public class StoreComparator<T extends StoreEmployee> implements Comparator<StoreEmployee> {
        
        @Override 
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int result = o1.store.compareTo(o2.store) ;
            if (result == 0) {
                return new Employee.EmployeeComparator<>(
                        "yearStarted"
                ).compare(o1, o2); 
            }
            return result; 
        }
    }
}
```

back to main class 

```java
public class Main {

    public static void main(String[] args) {
        
        //. .. 
        System.out.println("Store memebers ");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(101, "Ali", 2019, "Walmart"),
                new StoreEmployee(102, "Sara", 2020, "Target"),
                new StoreEmployee(103, "John", 2018, "Walmart"),
                new StoreEmployee(104, "Zara", 2021, "Target")
        ));
        
//        var genericEmployee = new StoreEmployee(); 
//        var comparator = genericEmployee.new StoreComparator<>(); 
        
        // or 
        var comparator = new StoreEmployee().new StoreComparator<>(); 
        storeEmployees.sort(comparator); 
        for(StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }
    }
}
```