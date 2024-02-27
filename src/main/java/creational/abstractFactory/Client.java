package creational.abstractFactory;

import creational.abstractFactory.factory.AbstractMobileFactory;
import creational.abstractFactory.factory.IphoneFactory;
import creational.abstractFactory.mobile.Mobile;

public class Client {

    public static void main(String args[]) {
        AbstractMobileFactory abstractMobileFactory = new IphoneFactory();
        Mobile mobile = abstractMobileFactory.getMobile("Iphone15");
        mobile.getDescription();
    }
}
