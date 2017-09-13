package Section7;

//Create Checkbox buttons
import javax.swing.*;
import java.awt.*;
import static java.awt.AWTEventMulticaster.add;
import java.awt.event.*;

public class CheckBoxTest extends JFrame{

    private JTextField t;
    private JCheckBox bold, italic;

    public CheckBoxTest(){
        super("JCheckBox Test");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        t = new JTextField("Watch the font style change", 20);
        t.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        c.add(t);

        //create checkbox objects
        bold = new JCheckBox("Bold");
        c.add(bold);

        italic = new JCheckBox("Italic");
        c.add(italic);



        CheckBoxHandler handler = new CheckBoxHandler();
        bold.addItemListener(handler);
        italic.addItemListener(handler);


        WindowListener listen = new WindowListener() {
            @Override
            public void windowOpened(WindowEvent we) {
                            }

            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent we) {
                            }

            @Override
            public void windowIconified(WindowEvent we) {
                            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                            }
            @Override
            public void windowActivated(WindowEvent we) {
                            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                            }
        };

        setSize(275, 100);
        show();
    }

    public static void main(String[] args){
        new CheckBoxTest();
    }

    private class CheckBoxHandler implements ItemListener{
        private int valBold = Font.PLAIN;
        private int valItalic = Font.PLAIN;

        public void itemStateChanged(ItemEvent e){
            if(e.getSource() == bold)
               if (e.getStateChange()== ItemEvent.SELECTED)
                   valBold = Font.BOLD;
            else
                   valBold = Font.PLAIN;
            }
        }
    }

