package DialogBoxes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Here is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
        
        //JOptionPane.showMessageDialog(null, "Virus B!TCH", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "WRONG B!TCH", "title", JOptionPane.ERROR_MESSAGE);
        //int answer = JOptionPane.showConfirmDialog(null, "HAHA YES OR NO?", "Question?", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("your name:?");
        String[] responese = {"No, you're awesome", "thanks!", "*blushig hard*"};
        //ImageIcon icon = new ImageIcon("key3.png");
        JOptionPane.showOptionDialog(null, "you are awesome", "Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responese, 0);
    }   
}
