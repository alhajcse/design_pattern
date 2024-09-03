public class Employee implements Cloneable {

    private String name;


    public Employee(String name) {
        this.name = name;
    }

    // Clone using Copy constructor
    public Employee(Employee existing) {
        this.name = existing.name;
        // deep copy
    }

    public String getName() {
        return name;
    }


    @Override
    public Employee clone() throws CloneNotSupportedException {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
