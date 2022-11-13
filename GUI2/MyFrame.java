package GUI2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.colorchooser.ColorChooserComponentFactory;

public class MyFrame extends JFrame{
    
    JButton button = new JButton();
    
    MyFrame(){
        JLabel label = new JLabel();

        ImageIcon icon = new ImageIcon("key.png");

        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.setIconTextGap(-35);
        button.setForeground(Color.cyan);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());

        button.setBounds(100, 100, 200, 250);
        button.addActionListener(e -> label.setVisible(true));
        button.setText("I'm a button!");
        button.setFocusable(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
}
