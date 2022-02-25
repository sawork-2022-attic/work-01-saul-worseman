package com.example.sawork01;

import com.example.sawork01.asciipanel.AsciiPanel;
import com.example.sawork01.config.AsciiPanelConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class SaWork01Application extends JFrame {
    AsciiPanel terminal;
    public SaWork01Application(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsciiPanelConfig.class);
        AsciiPanel terminal = context.getBean(AsciiPanel.class);
        int[] size = context.getBean(int[].class);
        for(int i = 0; i < size[0]; i++){
            for(int j = 0; j < size[1]; j++){
                terminal.write((char)(i * 16 + j), j, i);
            }
        }
        add(terminal);
        pack();
        repaint();
    }

    public static void main(String[] args) {
        SaWork01Application app = new SaWork01Application();
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
