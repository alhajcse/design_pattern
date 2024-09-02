public class Singleton {

    /*Static member: It gets memory only once because of static,
    it contains the instance of the Singleton class.*/
    private static Singleton instance;

    /*Private constructor: It will prevent to instantiate
    the Singleton class from outside the class.*/
    private Singleton() {
        // Initialization code, if needed
    }

    // Static method to get the instance
    /*Static factory method: This provides the global point of access to the
    Singleton object and returns the*/
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }



    /*We create a static method that provides access to the single instance of the class.
    We use double-checked locking to ensure thread safety.
    This technique minimizes synchronization overhead by checking if the instance is null before entering a synchronized block.*/

    // Static Instance with Double-Checked Locking for theard safe
    /*public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }*/


}
