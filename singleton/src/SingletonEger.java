public class SingletonEger {

    private static SingletonEger instance=new SingletonEger();

    private SingletonEger() {
        // Initialization code, if needed
    }

    // Static method to get the instance
    public static SingletonEger getInstance() {
        return instance;
    }
}
