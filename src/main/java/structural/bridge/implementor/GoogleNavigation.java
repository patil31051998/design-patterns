package structural.bridge.implementor;

public class GoogleNavigation implements Navigation{

    @Override
    public void getRoute(String src, String dest) {
        System.out.println("Get route via GoogleNavigation");
    }
}
