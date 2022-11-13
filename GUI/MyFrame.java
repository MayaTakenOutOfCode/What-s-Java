package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
    MyFrame(){
        /* 
        Border border = BorderFactory.createLineBorder(Color.white, 3);
        
        ImageIcon image2 = new ImageIcon("key.png");
        JLabel label = new JLabel(); //create a label
        label.setText("how are u!"); //set text of label
        label.setIcon(image2);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of ImageIcon 
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of ImageIcon
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.BOLD, 50)); //font
        label.setIconTextGap(-25); //txt and image gap
        label.setBackground(Color.black); //set bg color
        label.setOpaque(true); //to display bg color
        label.setBorder(border); //border display
        label.setVerticalAlignment(JLabel.CENTER); //label vertical positioning TOP, CENTER, BOTTOM
        label.setHorizontalAlignment(JLabel.CENTER); //label hoprizontal positioning
        label.setBounds(100,100,250,250); //set x and y position within frame as well as dimensions

*/      

        ImageIcon icon = new ImageIcon("key.png");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);


        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel(); 
        JPanel greenPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        //this.add(label);
        this.setTitle("Title"); //Give a title for frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of app
        this.setLayout(null);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
        //this.setResizable(false); //prevent frame from being resized
        this.setSize(750, 750); //sets the x dimmension and y dimmension of a frame
        this.setVisible(true); //make it visible
        greenPanel.add(label);
        
        //this.pack();

        ImageIcon image = new ImageIcon("key2.png"); //create an image icon
        this.setIconImage(image.getImage()); //set ImageIcon
        
        
    }
}
