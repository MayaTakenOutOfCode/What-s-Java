package textField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("Submit");
    JTextField textField = new JTextField();

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        
        button.addActionListener(this);


        
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.BOLD, 35));
        textField.setForeground(Color.RED);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.white);
        textField.setText("username");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Welcome bitch: " + textField.getText());   
            button.setEnabled(false);
            textField.setEditable(false);

        }
        
    }
}
