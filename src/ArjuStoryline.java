import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArjuStoryline extends JFrame {


    public ArjuStoryline() {
        super("Your Marvel Universe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);



        startAdventure();
    }

    private void startAdventure() {


        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("You end up in MCU universe. Choose who you wanna ride with?");
        label.setBounds(10, 10, 600, 20);
        panel.add(label);

        JButton ironManBtn = new JButton("Iron Man");
        ironManBtn.setBounds(10, 40, 100, 30);
        panel.add(ironManBtn);

        JButton thorBtn = new JButton("Thor");
        thorBtn.setBounds(110, 40, 100, 30);
        panel.add(thorBtn);
        
        JButton capUSABtn = new JButton("Captain America");
        capUSABtn.setBounds(210, 40, 180, 30);
        panel.add(capUSABtn);

        ironManBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ironManMission();
            }
        });

        thorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thorMission();
            }
        });
        
        capUSABtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                captainAmericaMission();
            }
        });

        setVisible(true);
    }
    



    private void ironManMission() {

        getContentPane().removeAll(); 

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Congrats! Now you and Iron Man are on a mission.");
        label.setBounds(10, 10, 380, 20);
        panel.add(label);

        JLabel missionLabel = new JLabel("Iron Man wants your help. What do you want to do?");
        missionLabel.setBounds(10, 40, 380, 20);
        panel.add(missionLabel);

        JButton trainBtn = new JButton("Train to be War Machine");
        trainBtn.setBounds(10, 70, 250, 30);
        panel.add(trainBtn);

        JButton replaceJarvisBtn = new JButton("Replace Jarvis");
        replaceJarvisBtn.setBounds(270, 70, 120, 30);
        panel.add(replaceJarvisBtn);

        trainBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();  

                JPanel panel = new JPanel();
                getContentPane().add(panel);
                panel.setLayout(null);

                JLabel label = new JLabel("You trained really hard to have the skills of Iron Man.");
                label.setBounds(10, 10, 380, 20);
                panel.add(label);

                JLabel missionLabel = new JLabel("An alien has attacked Earth, and you need to fight alongside Iron Man.");
                missionLabel.setBounds(10, 40, 600, 20);
                panel.add(missionLabel);

                JButton fightBtn = new JButton("Fight alongside Iron Man");
                fightBtn.setBounds(10, 70, 250, 30);
                panel.add(fightBtn);

                JButton standBackBtn = new JButton("Stand back and help Iron Man");
                standBackBtn.setBounds(270, 70, 250, 30);
                panel.add(standBackBtn);



                fightBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        getContentPane().removeAll();  

                        JPanel panel = new JPanel();
                        getContentPane().add(panel);
                        panel.setLayout(null);

                        JLabel label = new JLabel("With Iron Man, you have won the fight!");
                        label.setBounds(10, 10, 380, 20);
                        panel.add(label);
                        
                        JLabel nabel = new JLabel("However the threat is not gone forever. "
                        		+ "This might happen again. Let be prepared !!!");
                        nabel.setBounds(10, 30, 600, 20);
                        panel.add(nabel);
                        

                        JLabel missionLabel = new JLabel("Suggest to form the Avengers.");
                        missionLabel.setBounds(20, 50, 380, 20);
                        panel.add(missionLabel);

                        JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                        assembleAvengersBtn.setBounds(10, 70, 250, 30);
                        panel.add(assembleAvengersBtn);

                        assembleAvengersBtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                            	assembleAvengers();
                            }
                        });

                        setVisible(true);
                    }
                });




           

                standBackBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        getContentPane().removeAll(); 

                        JPanel panel = new JPanel();
                        getContentPane().add(panel);
                        panel.setLayout(null);

                        JLabel label = new JLabel("You gained the experience of the war and know the threat is not gone forever.");
                        label.setBounds(10, 10, 580, 20);
                        panel.add(label);

                        JLabel missionLabel = new JLabel("This might happen again. Let's be prepared!");
                        missionLabel.setBounds(10, 40, 580, 20);
                        panel.add(missionLabel);

                        JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                        assembleAvengersBtn.setBounds(10, 70, 250, 30);
                        panel.add(assembleAvengersBtn);

                        assembleAvengersBtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                            	assembleAvengers();
                            }
                        });

                        setVisible(true);
                    }
                });

             


                setVisible(true);
            }
        });




        replaceJarvisBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();  

                JPanel panel = new JPanel();
                getContentPane().add(panel);
                panel.setLayout(null);

                JLabel label = new JLabel("You have now replaced Jarvis for Iron Man. An alien attack has raised.");
                label.setBounds(10, 10, 580, 20);
                panel.add(label);

                JLabel missionLabel = new JLabel("What do you want to do?");
                missionLabel.setBounds(10, 40, 580, 20);
                panel.add(missionLabel);

                JButton helpIronManBtn = new JButton("Use your intelligence to help Iron Man");
                helpIronManBtn.setBounds(10, 70, 300, 30);
                panel.add(helpIronManBtn);

                JButton seekHelpBtn = new JButton("Seek help from others");
                seekHelpBtn.setBounds(320, 70, 250, 30);
                panel.add(seekHelpBtn);



                helpIronManBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        getContentPane().removeAll(); 

                        JPanel panel = new JPanel();
                        getContentPane().add(panel);
                        panel.setLayout(null);

                        JLabel label = new JLabel("You used your intelligence to assist Iron Man in defeating the aliens.");
                        label.setBounds(10, 10, 580, 20);
                        panel.add(label);

                        JLabel missionLabel = new JLabel("This threat is not the end. We need to be prepared.");
                        missionLabel.setBounds(10, 40, 580, 20);
                        panel.add(missionLabel);

                        JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                        assembleAvengersBtn.setBounds(10, 70, 250, 30);
                        panel.add(assembleAvengersBtn);

                        assembleAvengersBtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                            	assembleAvengers();
                            }
                        });

                        setVisible(true);
                    }
                });



                seekHelpBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        getContentPane().removeAll();  

                        JPanel panel = new JPanel();
                        getContentPane().add(panel);
                        panel.setLayout(null);

                        JLabel label = new JLabel("You asked SHIELDS to help and defeated the Aliens.");
                        label.setBounds(10, 10, 580, 20);
                        panel.add(label);

                        JLabel missionLabel = new JLabel("This threat is not the end. We need to be prepared.");
                        missionLabel.setBounds(10, 40, 580, 20);
                        panel.add(missionLabel);

                        JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                        assembleAvengersBtn.setBounds(10, 70, 250, 30);
                        panel.add(assembleAvengersBtn);

                        assembleAvengersBtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                            	assembleAvengers();
                            }
                        });

                        setVisible(true);
                    }
                });

                setVisible(true);
            }
        });



        setVisible(true);
    }
    
    
    
    
    
    
    
    private void thorMission() {
    	 getContentPane().removeAll();  

         JPanel panel = new JPanel();
         getContentPane().add(panel);
         panel.setLayout(null);

         JLabel label = new JLabel("Asgard has been under attack. Loki is missing. You have to help Thor during this hard time.");
         label.setBounds(10, 10, 580, 20);
         panel.add(label);

         JLabel missionLabel = new JLabel("What do you want to do?");
         missionLabel.setBounds(10, 40, 580, 20);
         panel.add(missionLabel);

         JButton fightWithThorBtn = new JButton("Fight with Thor to save Asgard");
         fightWithThorBtn.setBounds(10, 70, 300, 30);
         panel.add(fightWithThorBtn);

         JButton findLokiBtn = new JButton("Find Loki");
         findLokiBtn.setBounds(320, 70, 250, 30);
         panel.add(findLokiBtn);

         fightWithThorBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 getContentPane().removeAll(); 

                 JPanel panel = new JPanel();
                 getContentPane().add(panel);
                 panel.setLayout(null);

                 JLabel label = new JLabel("You fought alongside Thor to save Asgard from the attackers.");
                 label.setBounds(10, 10, 580, 20);
                 panel.add(label);

                 JLabel missionLabel = new JLabel("This threat is not the end. We need to be prepared.");
                 missionLabel.setBounds(10, 40, 580, 20);
                 panel.add(missionLabel);

                 JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                 assembleAvengersBtn.setBounds(10, 70, 250, 30);
                 panel.add(assembleAvengersBtn);

                 assembleAvengersBtn.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                    	 assembleAvengers();
                     }
                 });

                 setVisible(true);
             }
         });

         findLokiBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 getContentPane().removeAll(); 

                 JPanel panel = new JPanel();
                 getContentPane().add(panel);
                 panel.setLayout(null);

                 JLabel label = new JLabel("You went on a mission to find Loki and bring him back to Asgard.");
                 label.setBounds(10, 10, 600, 20);
                 panel.add(label);

                 JLabel missionLabel = new JLabel("This threat is not the end. We need to be prepared.");
                 missionLabel.setBounds(10, 40, 600, 20);
                 panel.add(missionLabel);

                 JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                 assembleAvengersBtn.setBounds(10, 70, 220, 30);
                 panel.add(assembleAvengersBtn);

                 assembleAvengersBtn.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                    	 assembleAvengers();
                     }
                 });

                 setVisible(true);
             }
         });

         setVisible(true);
    	
    }
    
    
    private void captainAmericaMission() {
    	
    	getContentPane().removeAll();  

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("As being Mr. USA, Steve Rogers faces the difficulty.");
        label.setBounds(10, 10, 600, 20);
        panel.add(label);
        
        JLabel label2 = new JLabel("to stop the return of Hydra or defeat Bucky Barnes, AKA The Winter Soldier. You need to make sure America is safe.");
        label2.setBounds(10, 30, 600, 20);
        panel.add(label2);
        
        

        JLabel missionLabel = new JLabel("What do you want to do?");
        missionLabel.setBounds(30, 60, 580, 20);
        panel.add(missionLabel);

       
        JButton stopHydraBtn = new JButton("Stop Hydra");
        stopHydraBtn.setBounds(10, 90, 120, 30);
        panel.add(stopHydraBtn);

        JButton defeatWinterSoldierBtn = new JButton("Defeat the Winter Soldier");
        defeatWinterSoldierBtn.setBounds(140, 90, 200, 30);
        panel.add(defeatWinterSoldierBtn);

        stopHydraBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll(); 

                JPanel panel = new JPanel();
                getContentPane().add(panel);
                panel.setLayout(null);

                JLabel label = new JLabel("You teamed with The Cap to make sure HYDRA doesn't return to end the world.");
                label.setBounds(10, 10, 600, 20);
                panel.add(label);

                JLabel missionLabel = new JLabel("This threat is not the end. We need to be prepared.");
                missionLabel.setBounds(10, 40, 600, 20);
                panel.add(missionLabel);

                JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                assembleAvengersBtn.setBounds(10, 70, 220, 30);
                panel.add(assembleAvengersBtn);

                assembleAvengersBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	assembleAvengers();
                    }
                });

                setVisible(true);
            }
        });

        defeatWinterSoldierBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll(); 

                JPanel panel = new JPanel();
                getContentPane().add(panel);
                panel.setLayout(null);

                JLabel label = new JLabel("You teamed with The Cap to make sure Bucky is defeated.");
                label.setBounds(10, 10, 600, 20);
                panel.add(label);

                JLabel missionLabel = new JLabel("However, the threat to the world is not over. We need to be prepared.");
                missionLabel.setBounds(10, 40, 600, 20);
                panel.add(missionLabel);

                JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                assembleAvengersBtn.setBounds(10, 70, 220, 30);
                panel.add(assembleAvengersBtn);

                assembleAvengersBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	assembleAvengers();
                    }
                });

                setVisible(true);
            }
        });

        setVisible(true);
    }
    
    
    private void assembleAvengers() {
    	getContentPane().removeAll();

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Avengers have been assembled!");
        label.setBounds(10, 10, 380, 20);
        panel.add(label);


        setVisible(true);

    	
    }
    
    
    
   

   
   
   
  
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ArjuStoryline();
            }
        });
    }
}
