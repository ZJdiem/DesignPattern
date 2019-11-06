package edu.hbu.csc.factorys;

import edu.hbu.csc.shapes.MyEllipse;

import java.awt.event.MouseEvent;

public class MyEllipseFactory extends ShapeFactory {
    private MyEllipse myEllipse=null;

    @Override
    public void mousePressed(MouseEvent e) {
        myEllipse=new MyEllipse();
        myEllipse.setStart(e.getX(),e.getY());
        if(shapeBacker!=null)shapeBacker.OnProducting(myEllipse);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        myEllipse.setNewPoint(e.getX(),e.getY());
        if(shapeBacker!=null)shapeBacker.OnBackShape(myEllipse);
        myEllipse=null;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(myEllipse!=null) {
            myEllipse.setNewPoint(e.getX(),e.getY());
            if(shapeBacker!=null)shapeBacker.OnProducting(myEllipse);
        }
    }
}
