package creational.prototype;

public class Client {

    public static void main(String args[]) throws CloneNotSupportedException {
        Employee employee1 = new Employee();
        Employee employee2 = (Employee) employee1.clone();
        employee2.addEmployee("E3");
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
