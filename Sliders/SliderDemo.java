package Sliders;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SliderDemo implements ChangeListener {
    
    JSlider slider = new JSlider(0, 100,50);
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JFrame frame = new JFrame("Slider Demo");
    

    SliderDemo(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);

        

        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.addChangeListener(this);
        label.setFont(new Font("MV Boli", Font.BOLD, 25));

        slider.setOrientation(SwingConstants.VERTICAL);
        
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());   
    }
}
