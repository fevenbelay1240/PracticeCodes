import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class JavaSwing {
    public static void main(String[] args) {
        //create a frame
        JFrame frame = new JFrame("Main Frame");
        //create a text field and set it's size
        JTextField text = new JTextField();
        text.setBounds(50, 50, 150, 20);
        //create a button with the text 'click here' inside and set it's size
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);

        //add actionListener to the button to make it responsive
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //change the text once the button is clicked
                text.setText("Just Clicked the button");
            }
        });
        frame.add(b);
        frame.add(text);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }
}
