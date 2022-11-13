package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        /* 
        JFrame frame = new JFrame(); //creates a frame

        frame.setTitle("Title"); //Give a title for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of app
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420, 420); //sets the x dimmension and y dimmension of a frame
        frame.setVisible(true); //make it visible
        frame.getContentPane().setBackground(new Color(123,50,250)); //change bg-color

        ImageIcon image = new ImageIcon("key2.png"); //create an image icon
        frame.setIconImage(image.getImage()); //set ImageIcon */

        MyFrame myFrame = new MyFrame();
    }
}
