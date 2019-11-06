import java.awt.*;

public class Protype {
    public static void main(String[] args) throws CloneNotSupportedException {
        StyleTemplate styleTemplate=new StyleTemplate();
        Rect rect=new Rect();
        rect.setStyle(styleTemplate.getTemplate("cool1"));
        Ellipse ellipse=new Ellipse();
        ellipse.setStyle(styleTemplate.getTemplate("cool2"));
        System.out.println(rect.getStyle().getColorSet().getFillColor());
        System.out.println(ellipse.getStyle().getColorSet().getFillColor());
        System.out.println(rect.getStyle().equals(ellipse.getStyle()));
    }
}
