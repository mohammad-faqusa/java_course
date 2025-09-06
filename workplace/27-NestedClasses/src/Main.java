import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1001, "Raplph" , 2015),
                new Employee(1005, "Mohammad" , 2015),
                new Employee(1022, "Ahmad" , 2021),
                new Employee(1022, "Hammam" , 2023),
                new Employee(1022, "JIM" , 2013)
        )) ;

        var comparator = new Employee.EmployeeComparator("yearStarted");
        employees.sort(comparator);
        System.out.println(employees);

        //        var comparator = new Employee.EmloyeeComparator<>();
//        employee.sort(comparator);

        System.out.println("Store memebers ");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(101, "Ali", 2019, "Walmart"),
                new StoreEmployee(102, "Sara", 2020, "Target"),
                new StoreEmployee(103, "John", 2018, "Walmart"),
                new StoreEmployee(104, "Zara", 2021, "Target")
        ));

        storeEmployees.sort(storeEmployees.get(0).new StoreEmployeeComparator());

        for(StoreEmployee employee : storeEmployees) {
            System.out.println(employee);
        }
    }

}