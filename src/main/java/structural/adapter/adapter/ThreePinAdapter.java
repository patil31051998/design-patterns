package structural.adapter.adapter;

import structural.adapter.adaptee.Charger;

public class ThreePinAdapter implements Adapter {

        private Charger charger;

    public ThreePinAdapter(Charger charger) {
        this.charger = charger;
    }

    @Override
    public void charge() {
        charger.chargeIphone();
    }
}
