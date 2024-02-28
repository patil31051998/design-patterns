package structural.adapter.adaptee;

public class Iphone4sCharger implements Charger {
    @Override
    public void chargeIphone() {
        System.out.println("Charging using Iphone4sCharger");
    }
}
