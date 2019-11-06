import java.awt.*;

public class Protype {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeStyle style=new ShapeStyle();
        Colors colors=new Colors();
        style.setColors(colors);
        colors.setEageColor(Color.red);
        colors.setFillColor(Color.WHITE);
        style.setLineWidth(2);
        Rect rect=new Rect();
        System.out.println(style);
        rect.setStyle(style.clone());

        rect.show();
        Ellipse ellipse=new Ellipse();
        colors.setEageColor(Color.BLUE);
        colors.setFillColor(Color.WHITE);
        ellipse.setStyle(style.clone());
        ellipse.show();
        rect.show();
    }
}
