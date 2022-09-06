package Lesson8i;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Punel extends JPanel {
    public Punel() {
        Font font = new Font("Arrial", Font.BOLD, 20);


        JButton myButton = new JButton();
        myButton.setFont(font);
        add(myButton);

        JButton myButton2 = new JButton("Нижняя кнопка");
        myButton2.setFont(font);
        add(myButton2);

        myButton.setText("0");



        //ButtonAction buttonAction = new ButtonAction(myButton);
        //myButton.addActionListener(buttonAction);

        //Аннонимный класс, вместо ButtonAction
        myButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myButton.setText(generatelephonnumber());
            }
        }
        );

        setVisible(true);
    }
    public String generatelephonnumber(){
        Random random = new Random();
        String telephoneNumber = "";
        telephoneNumber += "+7";
        telephoneNumber += "(999)";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);

        return telephoneNumber;

    }

    }

