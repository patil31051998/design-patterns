package creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee implements Cloneable {

    private List<String> names = new ArrayList<>();

    public Employee() {
        names.add("E1");
        names.add("E2");
    }

    public Employee(List<String> names) {
        this.names = names;
    }

    public List<String> getEmployees() {
        return names;
    }

    public Object clone() throws CloneNotSupportedException {
        List<String> cloneData = new ArrayList<>();
        this.names.stream().forEach(name -> cloneData.add(name));
        return new Employee(cloneData);
    }

    public void addEmployee(String name) {
        this.names.add(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "names=" + names +
                '}';
    }
}
