import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;

public class BrianStoryline extends Frame
{
    public static void main(String[] args)
    {
        JFrame f;
        f = new JFrame("Brian's Storyline");

        JLabel lb = new JLabel("<html>You are stranded on an abandoned island.<br>You notice an old row boat on the shore, a wrecked helicopter, and what seems to be a tent in the distance.<br>Which will you chose to visit?</html>");
        lb.setBounds(350, 200, 300, 300);
        f.add(lb);

        JButton rb = new JButton("Go to row boat");
        JButton wh = new JButton("Go to wrecked helicopter");
        JButton t = new JButton("Go to the tent");
        rb.setBounds(100, 450, 150, 50);
        wh.setBounds(375, 450, 200, 50);
        t.setBounds(700, 450, 150, 50);
        rb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setVisible(false);
                JFrame rowBoat = new JFrame("Row Boat Scene");
                rowBoat.setSize(1000, 1000);
                rowBoat.setLayout(null);
                rowBoat.setVisible(true);
            }
        });

        f.add(rb);
        f.add(wh);
        f.add(t);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}
