import java.util.Comparator;

public class StoreEmployee extends Employee{

    private String store;

    public StoreEmployee(int employeeId, String name, int yearStarter, String store) {
        super(employeeId, name, yearStarter);
        this.store = store;
    }

    public StoreEmployee(int employeeId, String name, int yearStarter) {
        super(employeeId, name, yearStarter);
    }

    public class StoreEmployeeComparator <T extends StoreEmployee> implements Comparator<StoreEmployee> {


        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int result = o1.getStore().compareTo(o2.getStore());

            if(result == 0) {
                return new Employee.EmployeeComparator<StoreEmployee>().compare(o1, o2);
            }
            return result;
        }
    }

    public String getStore() {
        return store;
    }

    @Override
    public String toString() {
        return "StoreEmployee{" +
                "store='" + store + '\'' +
                "} " + super.toString();
    }
}
