//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MagazineAgency magazineAgency = new MagazineAgency();

        Observer subscriber = new Subscriber();
        magazineAgency.addObserver(subscriber);

        // Simulating weather change
        magazineAgency.setMagazine("Update");

        // Output:
        // Phone Display: Weather updated - Sunny
        // TV Display: Weather updated - Sunny
    }
}