package creational.abstractFactory.factory;

import creational.abstractFactory.mobile.Mobile;

public interface AbstractMobileFactory {

    public Mobile getMobile(String model);
}
