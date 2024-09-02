//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee em = new Employee();
        em.setName("Jack");
        em.getName();
        System.out.println(em.getName());
        System.out.println(em);
        //Use the clone method to get the Employee object
        try {
            Employee empsNew = (Employee) em.clone();
            empsNew.setName("Alhaj");
            empsNew.getName();
            System.out.println(empsNew.getName());
            System.out.println(empsNew);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


        try {
            Employee empsNew1 = (Employee) em.clone();

            empsNew1.setName("Jonh");
            empsNew1.getName();
            System.out.println(empsNew1.getName());
            System.out.println(empsNew1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}