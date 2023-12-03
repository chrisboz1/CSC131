import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class theIsland extends Frame // Brian Reyna
{
    public static void main(String[] args)
    {
        JFrame f;
        f = new JFrame("The Island Storyline");

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
                rowAway.setBounds(150, 550, 250, 50);
                treasureMap1.setBounds(525, 550, 275, 50);

                rowAway.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        rowBoat.setVisible(false);
                        JFrame rowedOut = new JFrame("Row Out to Sea Scene");

                        JLabel rolb = new JLabel("<html>You rowed off the island and were killed by a shark!</html>");
                        rolb.setBounds(350, 200, 300, 300);
                        rowedOut.add(rolb);

                        rowedOut.setSize(1000, 1000);
                        rowedOut.setLayout(null);
                        rowedOut.setVisible(true);

                        rowedOut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });

                treasureMap1.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        rowBoat.setVisible(false);
                        JFrame hiddenTreasure1 = new JFrame("Hidden Treasure Scene");

                        JLabel ft1lb = new JLabel("<html>You went out to find the hidden treasure.<br>You found the hidden treasure and were rescued by a helicopter!</html>");
                        ft1lb.setBounds(350, 200, 300, 300);
                        hiddenTreasure1.add(ft1lb);

                        hiddenTreasure1.setSize(1000, 1000);
                        hiddenTreasure1.setLayout(null);
                        hiddenTreasure1.setVisible(true);

                        hiddenTreasure1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });

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

                JLabel whlb = new JLabel("<html>Inside the helicopter you find two maps, one map seems to lead to a campsite somewhere on the island.<br>You also notice there is another map that leads to a secret laboratory somewhere beneath the island<br>Which map will you take and follow?</html>");
                whlb.setBounds(350, 200, 300, 300);
                wreckedHelicopter.add(whlb);

                JButton campsite = new JButton("Take the map and find the campsite");
                JButton lab = new JButton("Take the other map and find the secret lab");
                campsite.setBounds(150, 550, 300, 50);
                lab.setBounds(525, 550, 300, 50);

                campsite.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        wreckedHelicopter.setVisible(false);
                        JFrame campsites = new JFrame("Campsite Scene");

                        JLabel cslb = new JLabel("<html>You go to the campsite on the far side of the island.<br>You find that there are others stranded on the island.<br>However they are native to the island and very hostile.<br>They quickly attack and kill you!</html>");
                        cslb.setBounds(350, 200, 300, 300);
                        campsites.add(cslb);

                        campsites.setSize(1000, 1000);
                        campsites.setLayout(null);
                        campsites.setVisible(true);

                        campsites.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });

                lab.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        wreckedHelicopter.setVisible(false);
                        JFrame labs = new JFrame("Lab Scene");

                        JLabel sllb = new JLabel("<html>You follow the map and it leads to a secret lab beneath the island.<br>You find creatures hidden in the lab and they attack you!<br>You are now one of them!</html>");
                        sllb.setBounds(350, 200, 300, 300);
                        labs.add(sllb);

                        labs.setSize(1000, 1000);
                        labs.setLayout(null);
                        labs.setVisible(true);

                        labs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });

                wreckedHelicopter.add(campsite);
                wreckedHelicopter.add(lab);
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

                JLabel tlb = new JLabel("<html>Inside of the tent you discover a map that leads to a hidden treasure somewhere on the island.<br>You also notice there are smoke signals in the tent.<br>Which item will you take and use?</html>");
                tlb.setBounds(350, 200, 300, 300);
                tent.add(tlb);

                JButton smokeSignal = new JButton("Take the smoke signals and try to escape the island");
                JButton treasureMap2 = new JButton("Take the map and find the hidden treasure");
                smokeSignal.setBounds(100, 550, 325, 50);
                treasureMap2.setBounds(550, 550, 300, 50);

                smokeSignal.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        tent.setVisible(false);
                        JFrame smokey = new JFrame("Smoke Signal Scene");

                        JLabel sslb = new JLabel("<html>You use the smoke signals to signal a helicopter overhead.<br>The helicopter finds you!<br>You are rescued and flown off the island!</html>");
                        sslb.setBounds(350, 200, 300, 300);
                        smokey.add(sslb);

                        smokey.setSize(1000, 1000);
                        smokey.setLayout(null);
                        smokey.setVisible(true);

                        smokey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });

                treasureMap2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        tent.setVisible(false);
                        JFrame hiddenTreasure2 = new JFrame("Hidden Treasure Scene");

                        JLabel ft2lb = new JLabel("<html>You went out to find the hidden treasure.<br>You found the hidden treasure and were rescued by a helicopter!</html>");
                        ft2lb.setBounds(350, 200, 300, 300);
                        hiddenTreasure2.add(ft2lb);

                        hiddenTreasure2.setSize(1000, 1000);
                        hiddenTreasure2.setLayout(null);
                        hiddenTreasure2.setVisible(true);

                        hiddenTreasure2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });

                tent.add(smokeSignal);
                tent.add(treasureMap2);
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
