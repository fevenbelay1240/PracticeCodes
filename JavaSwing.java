import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class JavaSwing extends Frame implements ActionListener {
    JTextField text;
    JFrame frame;
    JButton b ;
    JLabel label;
    JavaSwing() {
        // create a frame
         frame = new JFrame("Main Frame");
        // create a text field and set it's size
        text = new JTextField();
        text.setBounds(100, 50, 150, 20);
        // create a button with the text 'click here' inside and set it's size
         b = new JButton("Click Here");
        b.setBounds(125, 100, 95, 30);

        // add actionListener to the button to make it responsive
        b.addActionListener(this);

        // add labels
         label = new JLabel("First Label");
        label.setBounds(140, 70, 400, 30);
        frame.add(label);
        // add the button and text to the frame
        frame.add(b);
        frame.add(text);
        // set frame size and layout and make it visible
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = text.getText();
        if(s.length() < 3 || s.length() > 10){
            label.setText("Enter a word between 3 to 10 letters ");
        }
        else {
            label.setText("You entered " + s);
        }
    }
    public static void main(String[] args) {
        new JavaSwing();
    }
}
