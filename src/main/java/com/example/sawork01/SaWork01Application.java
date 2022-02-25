package com.example.sawork01;

import com.example.sawork01.asciipanel.AsciiPanel;
import com.example.sawork01.config.AsciiPanelConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class SaWork01Application extends JFrame {
    AsciiPanel terminal;
    public SaWork01Application(){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsciiPanelConfig.class);
//        AsciiPanel terminal = context.getBean(AsciiPanel.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AsciiPanelConfig.xml");
        AsciiPanel terminal = (AsciiPanel) ctx.getBean("AsciiPanel");
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 16; j++){
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
