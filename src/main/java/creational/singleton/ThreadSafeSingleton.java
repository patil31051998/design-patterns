package creational.singleton;

public class ThreadSafeSingleton {

    private ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {
    }

    public synchronized ThreadSafeSingleton getInstance() {
        if(threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

}
