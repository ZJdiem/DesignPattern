import java.util.Hashtable;

public class CircleFactory {
    private static final Hashtable<String,Circle> circles=new Hashtable<>();

    public static Circle getCircle(String color) {
        Circle circle=circles.get(color);
        if(circle==null){
            circle=new Circle(color);
            circles.put(color,circle);
            System.out.println("put "+color +" in circles");

        }
        return circle;
    }
}
