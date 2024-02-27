package creational.factory.method.notification;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Users notified by sms");
    }
}
