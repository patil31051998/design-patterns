package structural.bridge;

import structural.bridge.abstracts.Uber;
import structural.bridge.abstracts.UberEat;
import structural.bridge.implementor.AppleNavigation;

public class Client {

    public static void main(String[] args) {
        Uber uber = new UberEat(new AppleNavigation());
        uber.performOperation();
    }
}
