package creational.builder;

public class Client {

    public static void main(String args[]) {
        Computer computer = new Computer.ComputerBuilder("320GB", "8GB").isBluetoothEnabled(true).build();
        System.out.println(computer.toString());
    }
}
