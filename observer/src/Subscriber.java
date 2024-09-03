public class Subscriber implements Observer {
    private String magazine;
    @Override
    public void update(String magazine) {

        this.magazine = magazine;
        display();
    }

    private void display() {
        System.out.println("New magazine - " + magazine);
    }
}
