package CheckBox;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button = new JButton();
    JCheckBox checkBox = new JCheckBox();
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        
        button.setText("Submit");
        button.addActionListener(this);

        
        checkBox.setText("I am not a thing existing");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 35));
        //checkBox.setIcon(<icon>);
        //checkBox.setSelectedIcon(<icon>);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button){
            if(checkBox.isSelected()){
                System.out.println("I am not a robot <3");
            } 
            else{
                System.out.println("A robot here x3");
            }
        }
        
    }
}
