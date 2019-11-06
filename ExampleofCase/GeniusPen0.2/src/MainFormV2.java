import edu.hbu.csc.factorys.FACTORY_TYPE;
import edu.hbu.csc.shapes.MyCanvasPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFormV2 {
    private JPanel panel1;
    private JButton btnDrawRect;
    private JButton btnDrawEllipse;
    private JButton btnSave;
    private JButton btnLoad;
    private JPanel canvasPanel;
    private MyCanvasPanel clientCanvasPanel;
    public MainFormV2() {
        clientCanvasPanel=new MyCanvasPanel();
        clientCanvasPanel.setVisible(true);
        canvasPanel.add(BorderLayout.CENTER,clientCanvasPanel);
        btnDrawRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientCanvasPanel.setShapeFactory(FACTORY_TYPE.RECT);
            }
        });
        btnDrawEllipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientCanvasPanel.setShapeFactory(FACTORY_TYPE.ELLIPSE);
            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("精灵画笔");
        frame.setContentPane(new MainFormV2().panel1);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
