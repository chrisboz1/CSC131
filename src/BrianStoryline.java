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

        JLabel lb = new JLabel("<html>You are stranded on an abandoned island.<br>You notice an old row boat on the shore, a wrecked helicopter, and a what seems to be a tent in the distance.<br>Which will you chose to visit?</html>");
        lb.setBounds(350, 200, 300, 300);
        f.add(lb);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}
