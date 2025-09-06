import java.util.Comparator;

public class Employee {

    private int employeeId;
    private String name;
    private int yearStarted;

    public static class EmployeeComparator <T extends Employee>implements Comparator<Employee> {

        private String sortType;
        public EmployeeComparator() {
            this("name");
        }
        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }
        @Override
        public int compare(Employee o1, Employee o2) {
            if(sortType.equalsIgnoreCase("yearStarted")) {
                return (int) (o1.getYearStarted() - o2.getYearStarted());
            }
            return o1.getName().compareTo(o2.getName());
        }

    }

    public Employee (int employeeId, String name, int yearStarter) {
        this.employeeId = employeeId;
        this.name  = name;
        this.yearStarted = yearStarter;

    }

    public String getName() {

        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", yearStarted=" + yearStarted +
                '}';
    }
}