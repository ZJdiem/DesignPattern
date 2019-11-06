import java.awt.*;

public class Colors implements Cloneable {
    private Color eageColor,fillColor;

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
    public Colors clone() throws CloneNotSupportedException {
        return (Colors)super.clone();
    }
}
