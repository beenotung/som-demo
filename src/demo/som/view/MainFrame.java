package demo.som.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void start(String title) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame window = new MainFrame(title);
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MainFrame(String title) {
        initialize(title);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize(String title) {
        frame = new JFrame(title);
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainPanel contentPane = new MainPanel();
        frame.setContentPane(contentPane);
    }

}
