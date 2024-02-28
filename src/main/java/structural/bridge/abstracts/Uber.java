package structural.bridge.abstracts;

import structural.bridge.implementor.Navigation;

public abstract class Uber {

    protected Navigation navigation;

    public Uber(Navigation navigation) {
        this.navigation = navigation;
    }

    public abstract void performOperation();

}
