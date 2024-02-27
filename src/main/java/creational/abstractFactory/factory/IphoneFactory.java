package creational.abstractFactory.factory;

import creational.abstractFactory.mobile.Iphone14;
import creational.abstractFactory.mobile.Iphone15;
import creational.abstractFactory.mobile.Mobile;

public class IphoneFactory implements AbstractMobileFactory{
    @Override
    public Mobile getMobile(String model) {
        switch (model) {
            case "Iphone14":
                return new Iphone14();
            case "Iphone15":
                return new Iphone15();
            default:
                return null;
        }
    }
}
