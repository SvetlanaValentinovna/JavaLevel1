package Lesson8i;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AppCount extends JFrame {

    static int counter = 0;


    public AppCount() {
        setTitle("Мое первое оконное приложение");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        add(new Punel(), BorderLayout.CENTER);

        setVisible(true);
    }

}

