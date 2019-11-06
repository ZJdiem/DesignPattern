import javax.swing.text.Style;

public class Rect {
    private ShapeStyle style;

    public ShapeStyle getStyle() {
        return style;
    }

    public void setStyle(ShapeStyle style) {
        this.style = style;
        System.out.println(style);
    }
    public void show(){
        System.out.println("Rect: Color"+style.getColors().getEageColor()+"LineWidth"+style.getLineWidth());
    }
}
