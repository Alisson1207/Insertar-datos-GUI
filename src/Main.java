import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Form().panel);
        frame.pack();
        frame.setSize(550, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}