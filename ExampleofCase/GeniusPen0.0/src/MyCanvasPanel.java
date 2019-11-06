import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyCanvasPanel extends JPanel implements MouseListener,MouseMotionListener {
    private int x,y,rwidth,rheight;
    private boolean drawing=false;
    private java.util.List<Rectangle> a=new java.util.ArrayList<Rectangle>();
    public MyCanvasPanel(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        if(drawing) {
            g.clearRect(0, 0, this.getWidth(), this.getHeight());
            g.drawRect(x, y, rwidth, rheight);
            System.err.println("draw  " + x + ' ' + y + ' ' + rwidth + ' ' + rheight);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        drawing=true;
        x=e.getX();
        y=e.getY();
        rwidth=0;
        rheight=0;
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        rwidth=e.getX()-x;
        rheight=e.getY()-y;
        repaint();
        drawing=false;
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
            rwidth = e.getX() - x;
            rheight = e.getY() - y;
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
