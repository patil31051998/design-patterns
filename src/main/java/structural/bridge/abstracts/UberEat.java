package structural.bridge.abstracts;

import structural.bridge.implementor.Navigation;

public class UberEat extends Uber {

    public UberEat(Navigation navigation) {
        super(navigation);
    }

    public void performOperation() {
        navigation.getRoute("A", "B");
    }
}
