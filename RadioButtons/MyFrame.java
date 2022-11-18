package RadioButtons;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

    JRadioButton radioButton1 = new JRadioButton("pizza");
    JRadioButton radioButton2 = new JRadioButton("burger");
    JRadioButton radioButton3 = new JRadioButton("sushi");

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);


        //radioButton1.setIcon(<icon>);
        radioButton1.addActionListener(this);
        //radioButton2.setIcon(<icon>);
        radioButton2.addActionListener(this);
        //radioButton3.setIcon(<icon>);
        radioButton3.addActionListener(this);

        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == radioButton1){
            System.out.println("This is pizza!");
        }
        else if(e.getSource() == radioButton2){
            System.out.println("This is burger!");
        }
        else if (e.getSource() == radioButton3){
            System.out.println("This is sushii!");
        }
        
    }
    
}
