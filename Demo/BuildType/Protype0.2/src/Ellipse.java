public class Ellipse {
    private ShapeStyle style;

    public ShapeStyle getStyle() {
        return style;
    }

    public void setStyle(ShapeStyle style) {
        this.style = style;
    }
    public void show(){
        System.out.println("Ellipse: Color"+style.getColors().getEageColor()+"LineWidth"+style.getLineWidth());
    }
}
