package creational.abstractFactory.factory;

import creational.abstractFactory.mobile.*;

public class SamsungFactory implements AbstractMobileFactory{
    @Override
    public Mobile getMobile(String model) {
        switch (model) {
            case "SamsungS21":
                return new SamsungS21();
            case "SamsungGalaxy":
                return new SamsungGalaxy();
            default:
                return null;
        }
    }
}
