package creational.builder;

public class Computer {

    // Required Parameter
    private String HDD;
    private String Ram;

    // Optional Parameter
    private boolean isGraphicEnabled;
    private boolean isBluetoothEnabled;

    public Computer(String HDD, String Ram, boolean isGraphicEnabled, boolean isBluetoothEnabled) {
        this.HDD = HDD;
        this.Ram = Ram;
        this.isGraphicEnabled = isGraphicEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", Ram='" + Ram + '\'' +
                ", isGraphicEnabled=" + isGraphicEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder {

        private String HDD;
        private String Ram;
        private boolean isGraphicEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String Ram) {
            this.HDD = HDD;
            this.Ram = Ram;
        }

        public ComputerBuilder isGraphicEnabled(boolean isGraphicEnabled) {
            this.isGraphicEnabled = isGraphicEnabled;
            return this;
        }

        public ComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer(HDD, Ram, isGraphicEnabled, isBluetoothEnabled);
            return computer;
        }
    }
}
