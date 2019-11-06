import java.util.List;

public class Car {
    private static Car car=null;
    private static List<Car> cars=null;
    public static Car getInstance(){
        if (car==null)car=new Car();
        return car;
    }
    private Car(){
    }
    public void go(String t) {
        System.out.println("滴滴滴的去了"+t);
    }
}
