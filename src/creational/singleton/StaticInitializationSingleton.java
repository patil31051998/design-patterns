package creational.singleton;

public class StaticInitializationSingleton {
    
    private static StaticInitializationSingleton staticInitializationSingleton = null;

    {
        try {
            staticInitializationSingleton = new StaticInitializationSingleton();
        }
        catch (RuntimeException runtimeException) {
            System.out.println("Unable to create instance " + runtimeException.getMessage());
        }
    }

    private StaticInitializationSingleton() {}

    public static StaticInitializationSingleton getInstance() {
        return staticInitializationSingleton;
    }
}
