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
    }

}