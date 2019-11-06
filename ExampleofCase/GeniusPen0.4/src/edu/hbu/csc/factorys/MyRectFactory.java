package edu.hbu.csc.factorys;

import edu.hbu.csc.shapes.MyRect;

import java.awt.event.MouseEvent;

public class MyRectFactory extends ShapeFactory {
    private MyRect myRect=null;

    @Override
    public void mousePressed(MouseEvent e) {
        myRect=new MyRect();
        try {
            myRect.setShapeStyle(shapeStyle.clone());
        } catch (CloneNotSupportedException e1) {
            e1.printStackTrace();
        }
        myRect.setStart(e.getX(),e.getY());
        if(shapeBacker!=null)shapeBacker.OnProducting(myRect);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        myRect.setNewPoint(e.getX(),e.getY());
        if(shapeBacker!=null)shapeBacker.OnBackShape(myRect);
        myRect=null;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(myRect!=null) {
            myRect.setNewPoint(e.getX(),e.getY());
            if(shapeBacker!=null)shapeBacker.OnProducting(myRect);
        }
    }
}
