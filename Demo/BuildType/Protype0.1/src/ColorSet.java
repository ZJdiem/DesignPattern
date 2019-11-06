import java.awt.*;

public class ColorSet implements Cloneable{
    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getEageColor() {
        return eageColor;
    }

    public void setEageColor(Color eageColor) {
        this.eageColor = eageColor;
    }

    private Color fillColor;
    private Color eageColor;
    @Override
    public ColorSet clone() throws CloneNotSupportedException {
        return (ColorSet)super.clone();
    }
}
