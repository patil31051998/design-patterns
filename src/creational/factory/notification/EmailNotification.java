package creational.factory.method.notification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Users notified by email");
    }
}
