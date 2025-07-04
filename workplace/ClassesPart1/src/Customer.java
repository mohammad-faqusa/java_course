
import java.io.*;
public class Customer implements AutoCloseable {

    private String name;
    private double creditlimit;
    private String email;

    public Customer(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public Customer() {
        this("default name", 0 , "default email");
    }

    public Customer(String name, String email) {
        this(name, 0, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditlimit=" + creditlimit +
                ", email='" + email + '\'' +
                '}';
    }


    @Override
    public void close() throws Exception {
        System.out.println("Customer closed");
    }
}
