package Section7;

//Demonstration of JLabel class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelTest extends JFrame{

    private JLabel label1, label2, label3;

    public LabelTest(){
        super("Testing JLabel");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //JLabel constructor with a string argument
        label1 = new JLabel("Label with text.");
        label1.setToolTipText("This is label1.");
        c.add(label1);

        //JLabel constructor with string, Icon and alignment arguments
        Icon bug = new ImageIcon("bug1.gif");
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        c.add(label2);





    }
}
