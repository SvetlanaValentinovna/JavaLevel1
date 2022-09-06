package Lesson8count;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AppCount extends JFrame{

    static int counter = 0;

    public AppCount(){
        setTitle("Мое первое оконное приложение");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100, 300,300);

        Font font = new Font("Arrial", Font.BOLD, 20);

        setLayout(new FlowLayout());

        JButton myButton = new JButton();
        myButton.setFont(font);
        add(myButton, BorderLayout.NORTH);

        JButton myButton2 = new JButton("Нижняя кнопка");
        myButton.setFont(font);
        add(myButton2, BorderLayout.SOUTH);

        myButton.setText(String.valueOf(0));


        //ButtonAction buttonAction = new ButtonAction(myButton);
        //myButton.addActionListener(buttonAction);

        //Аннонимный класс, вместо ButtonAction
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //counter++;
                //myButton.setText(String.valueOf(counter));
                myButton.setText(generatelephonnumber());
            }

        });

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
