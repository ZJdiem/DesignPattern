import edu.hbu.csc.shapes.MyRect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class MyCanvasPanel extends JPanel implements MouseListener,MouseMotionListener {
    private MyRect rect=null;
    private boolean drawing=false;
    public MyCanvasPanel(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        if (rect != null) {
            g.clearRect(0, 0, this.getWidth(), this.getHeight());
            rect.draw(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        drawing=true;
        rect=new MyRect();
        rect.setStart(e.getX(),e.getY());
        rect.setNewPoint(e.getX(),e.getY());
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        rect.setNewPoint(e.getX(),e.getY());
        repaint();
        drawing=false;
        rect=null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(drawing) {
            rect.setNewPoint(e.getX(),e.getY());
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
