import java.awt.*;

public class Style implements Cloneable{

    public ColorSet getColorSet() {
        return colorSet;
    }

    public void setColorSet(ColorSet colorSet) {
        this.colorSet = colorSet;
    }

    private ColorSet colorSet;



    public float getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(float lineWidth) {
        this.lineWidth = lineWidth;
    }

    private float lineWidth;


    public Style() {
    }


    @Override
    public Style clone() throws CloneNotSupportedException {

        Style s=(Style) super.clone();
        s.setColorSet(s.getColorSet().clone());
        return s;
    }
}
