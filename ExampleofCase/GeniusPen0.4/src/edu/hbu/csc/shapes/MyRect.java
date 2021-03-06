package edu.hbu.csc.shapes;

import java.awt.*;

public class MyRect extends edu.hbu.csc.shapes.Shape {
    private int x1,y1,x2,y2;
    private Color color;

    public MyRect(){
        color=Color.BLACK;
    }
    @Override
    public void draw(Graphics2D g){
        int x=Math.min(x1,x2);
        int y=Math.min(y1,y2);
        int width=Math.abs(x1-x2);
        int height=Math.abs(y1-y2);
        Color c=g.getColor();
        float w=shapeStyle.getPenWidth();
        g.setStroke(new BasicStroke(w));
        g.setColor(shapeStyle.getColor());
        g.drawRect(x,y,width,height);
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
        g.drawRect(x,y,width,height);
        g.setColor(c);
    }

    public void setStart(int x, int y) {
        this.x1=this.x2=x;
        this.y1=this.y2=y;
    }

    public void setNewPoint(int x, int y) {
        this.x2=x;
        this.y2=y;
    }
}
