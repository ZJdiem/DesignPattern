import edu.hbu.csc.factorys.FACTORY_TYPE;
import edu.hbu.csc.shapes.MyCanvasPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeniusPenFormV3 {
    private JPanel panel1;
    private JButton btnDrawRect;
    private JButton btnDrawEllipse;
    private JButton btnSave;
    private JButton btnLoad;
    private JButton btnSetColor;
    private JButton btnSetPenWidth;
    private MyCanvasPanel clientCanvasPanel;

    public GeniusPenFormV3() {
        btnDrawRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    clientCanvasPanel.setShapeFactory(FACTORY_TYPE.RECT);
                } catch (CloneNotSupportedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnDrawEllipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    clientCanvasPanel.setShapeFactory(FACTORY_TYPE.ELLIPSE );
                } catch (CloneNotSupportedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientCanvasPanel.save("d:\\a.shp");
            }
        });
        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    clientCanvasPanel.load("d:\\a.shp");
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnSetColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    clientCanvasPanel.chooseColor();
                } catch (CloneNotSupportedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnSetPenWidth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    clientCanvasPanel.choosePenWidth();
                } catch (CloneNotSupportedException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GeniusPenFormV3");
        frame.setContentPane(new GeniusPenFormV3().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.pack();
        frame.setVisible(true);
    }
}
