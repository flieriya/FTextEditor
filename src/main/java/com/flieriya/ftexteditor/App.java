package com.flieriya.ftexteditor;

import javax.swing.*;

/**
 * Hello world!
 */
public class App extends JFrame {
    public App(){
       setTitle("Hello");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                App app = new App();
                app.setVisible(true);
            }
        });

    }
}
