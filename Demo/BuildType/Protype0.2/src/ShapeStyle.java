import java.awt.*;

public class ShapeStyle implements Cloneable {
    private int lineWidth;
    private Colors colors;

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public ShapeStyle clone() throws CloneNotSupportedException {
        ShapeStyle shapeStyle= (ShapeStyle) super.clone();
        shapeStyle.setColors(colors.clone());
        return shapeStyle;
    }

}
