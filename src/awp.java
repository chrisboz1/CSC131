import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;

public class awp extends Frame
{
    public static void main(String[] args)
    {
        Button b;
        Choice c = new Choice();
        JFrame f;
        f = new JFrame("Choose Your Own Adventure");
        b = new Button("Click Here to Begin");
        b.setBounds(400, 400, 200, 200);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                c.add("Pick Your Adventure!");
                c.add("Zamiel's Storyline");
                c.add("Emily's Storyline");
                c.add("Arju's Storyline");
                c.add("Brian's Storyline");
                c.add("Z's Storyline");
                c.add("Chris's Storyline");
                f.add(c);

                c.addItemListener(new ItemListener()
                {
                    public void itemStateChanged(ItemEvent e)
                    {
                        if (Objects.equals(c.getSelectedItem(), "Zamiel's Storyline"))
                        {
                            f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                            CrystalStoryline.main(args);
                        }
                        else if (Objects.equals(c.getSelectedItem(), "Emily's Storyline"))
                        {
                            f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                            // go to Emily's Storyline
                        }
                        else if (Objects.equals(c.getSelectedItem(), "Arju's Storyline"))
                        {
                            f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                            // go to Arju's Storyline
                        }
                        else if (Objects.equals(c.getSelectedItem(), "Brian's Storyline"))
                        {
                            f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                            BrianStoryline.main(args);
                        }
                        else if (Objects.equals(c.getSelectedItem(), "Z's Storyline"))
                        {
                            f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                            // go to Z's Storyline
                        }
                        else
                        {
                            f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                            // go to Chris's Storyline
                        }

                    }
                });
            }
        });

        f.add(b);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}
