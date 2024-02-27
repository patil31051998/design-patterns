package creational.factory.method;

import creational.factory.method.notification.Notification;

public class Client {

    public static void main(String args[]) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.getNotificationObject("Email");
        notification.notifyUser();
    }
}
