import javax.swing.*;
import java.awt.*;

public class MainFormV0 {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel canvasPanel;
    private MyCanvasPanel clientCanvasPanel;
    public MainFormV0() {
        clientCanvasPanel=new MyCanvasPanel();
        clientCanvasPanel.setVisible(true);
        canvasPanel.add(BorderLayout.CENTER,clientCanvasPanel);
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("ttt");
        frame.setContentPane(new MainFormV0().panel1);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
