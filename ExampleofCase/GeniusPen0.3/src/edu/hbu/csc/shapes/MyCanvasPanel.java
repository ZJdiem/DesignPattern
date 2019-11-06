package edu.hbu.csc.shapes;

import edu.hbu.csc.factorys.*;
import edu.hbu.csc.utils.ShapeStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static edu.hbu.csc.factorys.FACTORY_TYPE.*;

public class MyCanvasPanel extends JPanel implements MouseListener,MouseMotionListener,KeyListener,ShapeBacker {
    private List<Shape> shapes=new ArrayList<>();
    private Shape shape=null;
    private ShapeFactory shapeFactory=null;
    private ShapeStyle shapeStyle=new ShapeStyle();
    //private java.util.List<Rectangle> a=new java.util.ArrayList<Rectangle>();
    public MyCanvasPanel(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void setShapeFactory(FACTORY_TYPE factoryType) throws CloneNotSupportedException {
        switch (factoryType){
            case RECT:shapeFactory=new MyRectFactory();break;
            case ELLIPSE:shapeFactory=new MyEllipseFactory();break;
        }
        if(shapeFactory!=null){
            shapeFactory.setBacker(this);
            shapeFactory.setShapeStyle(shapeStyle.clone());
        }
    }
    public void chooseColor() throws CloneNotSupportedException {
        if(shapeFactory!=null){
            shapeStyle.chooseColor();
            shapeFactory.setShapeStyle(shapeStyle.clone());
        }
    }
    public void choosePenWidth() throws CloneNotSupportedException {
        if(shapeFactory!=null){
            shapeStyle.choosePenWidth();
            shapeFactory.setShapeStyle(shapeStyle.clone());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D)g;
        g2.clearRect(0,0,getWidth(),getHeight());
        for(Shape s:shapes){
            s.draw(g2);
        }
        if(shape!=null) {
            shape.drawing(g2);
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


    public void save(String fileName) {
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(shapes);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void load(String fileName) throws ClassNotFoundException {
        shapes.clear();
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName));
            shapes=(ArrayList<Shape>)ois.readObject();
            ois.close();
            repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
