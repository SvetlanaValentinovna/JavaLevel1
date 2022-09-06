package Lesson8i;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class ButtonActionCount implements ActionListener {

       private JButton button;

        public ButtonActionCount(JButton button) {
            this.button = button;
        }



        @Override
        public void actionPerformed(ActionEvent e) {
             button.setText("Я нажата");

        }
    }
