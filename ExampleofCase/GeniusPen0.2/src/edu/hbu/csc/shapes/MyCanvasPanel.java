package edu.hbu.csc.shapes;

import edu.hbu.csc.factorys.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static edu.hbu.csc.factorys.FACTORY_TYPE.*;

public class MyCanvasPanel extends JPanel implements MouseListener,MouseMotionListener,ShapeBacker {
    private List<Shape> shapes=new ArrayList<>();
    private Shape shape=null;
    private ShapeFactory shapeFactory=null;
    //private java.util.List<Rectangle> a=new java.util.ArrayList<Rectangle>();
    public MyCanvasPanel(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void setShapeFactory(FACTORY_TYPE factoryType){
        switch (factoryType){
            case RECT:shapeFactory=new MyRectFactory();shapeFactory.setBacker(this);break;
            case ELLIPSE:shapeFactory=new MyEllipseFactory();shapeFactory.setBacker(this);break;
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        g.clearRect(0,0,getWidth(),getHeight());
        for(Shape s:shapes){
            s.draw(g);
        }
        if(shape!=null) {
            shape.drawing(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(shapeFactory!=null)shapeFactory.mouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(shapeFactory!=null){
            shapeFactory.mousePressed(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(shapeFactory!=null)shapeFactory.mouseReleased(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(shapeFactory!=null)shapeFactory.mouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(shapeFactory!=null)shapeFactory.mouseExited(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(shapeFactory!=null)shapeFactory.mouseDragged(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(shapeFactory!=null)shapeFactory.mouseMoved(e);
    }

    @Override
    public void OnBackShape(Shape s) {
        shapes.add(s);
        shape=null;
        repaint();
    }

    @Override
    public void OnProducting(Shape s) {
        shape=s;
        repaint();
    }


}
