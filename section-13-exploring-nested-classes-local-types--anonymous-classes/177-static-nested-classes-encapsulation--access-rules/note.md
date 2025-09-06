## 177. Static Nested Classes: Encapsulation & Access Rules

### Static Nested Class 

### the process 
1. create project `NestedClasses`

```java
public class Main {

    public static void main(String[] args) {
        
    }
}
```
2. employee 
```java
public class Employee {

    private int employeeId; 
    private String name; 
    private int yearStarter; 
    
    public Employee (int employeeId, String name, int yearStarter) {
        
        this.employeeId = employeeId; 
        this.name  = name; 
        this.yearStarter = yearStarter; 
        
        
    }
    
    public String getName() {
        
        return "%d %-8s %d".formatted(employeeId, name, yearStarter); 
    }
    
    
}
```

3. create employee comparator 
```java
public class EmployeeComparator <T extends Employee>implements Comparator<Employee> {
    
    @Override 
    public int comapre(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName()); 
    }
}
```

4. in main method : 
```java
public class Main {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1001, "Raplph" , 2015), 
                new Employee(1005, "Mohammad" , 2015), 
                new Employee(1022, "Ahmad" , 2021), 
                new Employee(1022, "Hammam" , 2023), 
                new Employee(1022, "JIM" , 2013)
        )) ; 
        
        var comparator = new EmloyeeComparator<>(); 
        employee.sort(comparator); 
    }
}
```
5. move the comparator employee class inside the employee class 

```java
public class Employee {

    private int employeeId; 
    private String name; 
    private int yearStarter;

    public static class EmployeeComparator <T extends Employee>implements Comparator<Employee> {

        private String sortType; 
        public EmployeeComparator() {
            this("name"); 
        }
        public EmployeeComparator(String sortType) {
            this.sortType = sortType; 
        }
        @Override
        public int comapre(Employee o1, Employee o2) {
            if(sortType.equalsIgnoreCase("yearStarted")) {
                return (int) (o1.getYearStarted() - o2.getYearStarted()); 
            }
            return o1.getName().compareTo(o2.getName());
        }
    }
    
    public Employee (int employeeId, String name, int yearStarter) {
        
        this.employeeId = employeeId; 
        this.name  = name; 
        this.yearStarter = yearStarter; 
        
        
    }
    
    public String getName() {
        
        return "%d %-8s %d".formatted(employeeId, name, yearStarter); 
    }
    
    
}
```

use in main method 


```java
public class Main {

    public static void main(String[] args) {
        
        // ....  
        
//        var comparator = new Employee.EmloyeeComparator<>(); 
//        employee.sort(comparator); 
        employee.sort(new Employee.EmployeeComparator("yearStarted")); 
    }
}
```