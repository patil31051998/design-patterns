package structural.bridge.abstracts;

import structural.bridge.implementor.Navigation;

public class UberRide extends Uber {

    public UberRide(Navigation navigation) {
        super(navigation);
    }

    public void performOperation() {
        navigation.getRoute("A", "B");
    }
}
