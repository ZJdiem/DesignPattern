package edu.hbu.csc.shapes;


import edu.hbu.csc.utils.ShapeStyle;

import java.awt.*;
import java.io.Serializable;

public abstract class Shape implements Serializable {
    public ShapeStyle getShapeStyle() {
        return shapeStyle;
    }

    public void setShapeStyle(ShapeStyle shapeStyle) {
        this.shapeStyle = shapeStyle;
    }

    protected ShapeStyle shapeStyle=null;

    public abstract void draw(Graphics2D g);
    public abstract void drawing(Graphics2D g);
}
