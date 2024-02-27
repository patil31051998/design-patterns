package creational.singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton
            eagerInitializationSingleton = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {}

    public static EagerInitializationSingleton getInstance() {
        return eagerInitializationSingleton;
    }
}
