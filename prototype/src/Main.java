//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Employee originalEm = new Employee("Alhaj");
        originalEm.getName();
        System.out.println(originalEm.getName());
        System.out.println(originalEm);


        //Use the clone method to get the Employee object
        try {
            Employee shallowClone = originalEm.clone();
            shallowClone.getName();
            System.out.println(shallowClone.getName());
            System.out.println(shallowClone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


        try {
            Employee deepClone = new Employee(originalEm);
            deepClone.getName();
            System.out.println(deepClone.getName());
            System.out.println(deepClone);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}