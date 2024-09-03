//Proxy Design Pattern provides a surrogate (act on behalf of another) or placeholder
// for another object to control access to it.
public class Main {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();

    }
}