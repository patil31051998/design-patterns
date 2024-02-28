package structural.adapter;

import structural.adapter.adaptee.Iphone4sCharger;
import structural.adapter.adapter.Adapter;
import structural.adapter.adapter.ThreePinAdapter;

public class Client {

    public static void main(String args[]) {
        Adapter adapter = new ThreePinAdapter(new Iphone4sCharger());
        adapter.charge();
    }
}
