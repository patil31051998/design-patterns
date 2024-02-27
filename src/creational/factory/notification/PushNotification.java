package creational.factory.method.notification;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Users notified by pusj");
    }
}
