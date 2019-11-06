import java.util.Hashtable;

public class CircleFactory {
    private static Hashtable<String,Circle> circles=new Hashtable<>();
    public static Circle getCircle(String color)
    {
        Circle circle=circles.get(color);
        if(circle==null){
            circle=new Circle(color);
            circles.put(color,circle);
            System.out.println(color +" circle putting in circles.");
        }
        return circle;
    }
}
