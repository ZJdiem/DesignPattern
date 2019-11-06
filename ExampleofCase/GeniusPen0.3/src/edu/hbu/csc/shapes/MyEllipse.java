package edu.hbu.csc.shapes;

import java.awt.*;

public class MyEllipse extends Shape{
    private int x1,y1,x2,y2;
    public void setStart(int x,int y){
        x1=x2=x;
        y1=y2=y;

    }
    public void setNewPoint(int x,int y){
        x2=x;
        y2=y;
    }
    @Override
    public void draw(Graphics2D g) {
        int x=Math.min(x1,x2);
        int y=Math.min(y1,y2);
        int width=Math.abs(x1-x2);
        int height=Math.abs(y1-y2);
        Color c=g.getColor();
        g.setStroke(new BasicStroke(shapeStyle.getPenWidth()));
        g.setColor(shapeStyle.getColor());
        g.drawOval(x,y,width,height);
        g.setColor(c);
    }

    @Override
    public void drawing(Graphics2D g) {
        int x=Math.min(x1,x2);
        int y=Math.min(y1,y2);
        int width=Math.abs(x1-x2);
        int height=Math.abs(y1-y2);
        Color c=g.getColor();
        g.setColor(Color.gray);
        g.drawOval(x,y,width,height);
        g.setColor(c);
    }
}
