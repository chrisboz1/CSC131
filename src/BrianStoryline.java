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

                JLabel rblb = new JLabel("<html>In the rowboat you find that the boat is still usable and has oars.<br>You also notice that there is a treasure map laying on the floor of the boat.<br>Do you attempt to row the boat off the island or stay and try to find the treasure?</html>");
                rblb.setBounds(350, 200, 300, 300);
                rowBoat.add(rblb);

                JButton rowAway = new JButton("Take the boat and row off the island");
                JButton treasureMap1 = new JButton("Take the map and find the hidden treasure");
                rowAway.setBounds(100, 550, 200, 50);
                treasureMap1.setBounds(375, 550, 200, 50);

                rowBoat.add(rowAway);
                rowBoat.add(treasureMap1);
                rowBoat.setSize(1000, 1000);
                rowBoat.setLayout(null);
                rowBoat.setVisible(true);
            }
        });

        wh.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setVisible(false);
                JFrame wreckedHelicopter = new JFrame("Wrecked Helicopter Scene");



                wreckedHelicopter.setSize(1000, 1000);
                wreckedHelicopter.setLayout(null);
                wreckedHelicopter.setVisible(true);
            }
        });

        t.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setVisible(false);
                JFrame tent = new JFrame("Tent Scene");



                tent.setSize(1000, 1000);
                tent.setLayout(null);
                tent.setVisible(true);
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
