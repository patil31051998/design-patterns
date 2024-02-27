package creational.factory.method;

import creational.factory.method.notification.EmailNotification;
import creational.factory.method.notification.Notification;
import creational.factory.method.notification.PushNotification;
import creational.factory.method.notification.SmsNotification;

public class NotificationFactory {

    public Notification getNotificationObject(String notificationType) {
        switch (notificationType) {
            case "Email" :
                return new EmailNotification();
            case "Sms" :
                return new SmsNotification();
            case "Push" :
                return new PushNotification();
            default:
                return null;

        }
    }
}
