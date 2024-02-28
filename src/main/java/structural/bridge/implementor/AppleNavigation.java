package structural.bridge.implementor;

public class AppleNavigation implements Navigation{

    @Override
    public void getRoute(String src, String dest) {
        System.out.println("Get route via AppleNavigation");
    }
}
