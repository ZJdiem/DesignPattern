package edu.hbu.csc.utils;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ShapeStyle implements Cloneable,Serializable {
    private final Color DEFAULT_COLOR=Color.red;
    private final float DEFAULT_PENWIDTH= (float) 2.0;
    private Color color;
    private float penWidth;
    public ShapeStyle(){
        color=DEFAULT_COLOR;
        penWidth=DEFAULT_PENWIDTH;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPenWidth() {
        return penWidth;
    }

    public void setPenWidth(float penWidth) {
        this.penWidth = penWidth;
    }
    public void chooseColor(){
        color=JColorChooser.showDialog(null,"选择图形颜色",color);
    }
    public void choosePenWidth(){
        String str=JOptionPane.showInputDialog(null,"输入线宽","输入线宽",JOptionPane.PLAIN_MESSAGE);
        Scanner scanner=new Scanner(str);
        penWidth=scanner.nextFloat();
    }
    public ShapeStyle clone() throws CloneNotSupportedException {
        return (ShapeStyle) super.clone();
    }
}
