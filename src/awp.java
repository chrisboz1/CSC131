package FinalProjectPractice;
import java.awt.*;
import java.awt.event.*;
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
                c.add("Zamiel's Storyline");
                c.add("Emilys Storyline");
                c.add("Arju's Storyline");
                c.add("Brian's Storyline");
                c.add("Z's Storyline");
                c.add("Chris's Storyline");
                f.add(c);

                c.addItemListener(new ItemListener() 
                {
                    public void itemStateChanged(ItemEvent e)
                    {
                        if (c.getSelectedItem() == "Zamiel's Storyline")
                        {
                            // go to Zamiel's Storyline
                            System.out.println("Zamiel");
                        }
                        else if (c.getSelectedItem() == "Emily's Storyline")
                        {
                            // go to Emily's Storyline
                            System.out.println("Emily");
                        }
                        else if (c.getSelectedItem() == "Arju's Storyline")
                        {
                            // go to Arju's Storyline
                            System.out.println("Arju");
                        }
                        else if (c.getSelectedItem() == "Brian's Storyline")
                        {
                            // go to Brian's Storyline
                            System.out.println("Brian");
                        }
                        else if (c.getSelectedItem() == "Z's Storyline")
                        {
                            // go to Z's Storyline
                            System.out.println("Z");
                        }
                        else
                        {
                            // go to Chris's Storyline
                            System.out.println("Chris");
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