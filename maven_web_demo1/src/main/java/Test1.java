import javax.swing.*;
import java.awt.event.*;

public class Test1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        JScrollPane scrollPane = new JScrollPane();
        JTextArea textArea = new JTextArea();

        scrollPane.setViewportView(textArea);
        frame.add(scrollPane);
        frame.setBounds(250, 300, 400, 300);
//        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
