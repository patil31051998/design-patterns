package creational.singleton;

public class ThreadSafeSingletonEfficient {

    private ThreadSafeSingletonEfficient threadSafeSingletonEfficient;

    private ThreadSafeSingletonEfficient() {
    }

    public ThreadSafeSingletonEfficient getInstance() {
        if(threadSafeSingletonEfficient == null) {
            synchronized (this) {
                if(threadSafeSingletonEfficient == null) {
                    threadSafeSingletonEfficient = new ThreadSafeSingletonEfficient();
                }
            }
        }
        return threadSafeSingletonEfficient;
    }
}
