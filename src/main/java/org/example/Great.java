package org.example;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Great extends JFrame {
    JButton button1;
    JButton button2;
    JButton button3;
    Great(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(420,420));

        button1=new JButton("Lame Message");
        button2=new JButton("MyPlayer");
        button3=new JButton("MyGame");

        button2.setFocusable(false);
        button2.setSize(50,20);
        button3.setFocusable(false);
        button3.setSize(50,20);
        button1.setFocusable(false);
        button1.setSize(50,20);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello, World");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    MyFrame myFrame=new MyFrame();
                } catch (UnsupportedAudioFileException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (LineUnavailableException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    Frame frame=new Frame();
                } catch (UnsupportedAudioFileException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (LineUnavailableException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
}
