import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArjuStoryline extends JFrame {


    public ArjuStoryline() {
        super("Your Marvel Universe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 450);
        setLocationRelativeTo(null);



        startAdventure();
    }
    


    private void startAdventure() {
    	JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/MCU.jpeg"));


        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

     
        JPanel panel = new JPanel(null);
        panel.setOpaque(false); 
        panel.setBounds(0, 0, getWidth(), getHeight());
        
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

    	JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/ironman.jpeg"));


        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

     
        JPanel panel = new JPanel(null);
        panel.setOpaque(false); 
        panel.setBounds(0, 0, getWidth(), getHeight());
        
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);
        
        
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

            	JLayeredPane layeredPane = new JLayeredPane();
                getContentPane().add(layeredPane);

                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/warmachine.jpeg"));


                JLabel backgroundLabel = new JLabel(backgroundImage);
                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

             
                JPanel panel = new JPanel(null);
                panel.setOpaque(false); 
                panel.setBounds(0, 0, getWidth(), getHeight());
                
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

                    	JLayeredPane layeredPane = new JLayeredPane();
                        getContentPane().add(layeredPane);

                        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/assemble.jpeg"));


                        JLabel backgroundLabel = new JLabel(backgroundImage);
                        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

                     
                        JPanel panel = new JPanel(null);
                        panel.setOpaque(false); 
                        panel.setBounds(0, 0, getWidth(), getHeight());
                        
                        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

                        JLabel label = new JLabel("With Iron Man, you have won the fight!");
                        label.setBounds(10, 10, 380, 20);
                        panel.add(label);
                        
                        JLabel nabel = new JLabel("However the threat is not gone forever. "
                        		+ "This might happen again. Let be prepared !!!");
                        nabel.setBounds(10, 30, 600, 20);
                        panel.add(nabel);
                        

                        JLabel missionLabel = new JLabel("Suggest to form the Avengers.");
                        missionLabel.setBounds(10, 50, 380, 20);
                        panel.add(missionLabel);

                        JButton assembleAvengersBtn = new JButton("Assemble Avengers");
                        assembleAvengersBtn.setBounds(10, 90, 250, 30);
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
                        
                    	JLayeredPane layeredPane = new JLayeredPane();
                        getContentPane().add(layeredPane);

                        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/assemble.jpeg"));


                        JLabel backgroundLabel = new JLabel(backgroundImage);
                        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

                     
                        JPanel panel = new JPanel(null);
                        panel.setOpaque(false); 
                        panel.setBounds(0, 0, getWidth(), getHeight());
                        
                        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

            	JLayeredPane layeredPane = new JLayeredPane();
                getContentPane().add(layeredPane);

                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/jarvis.jpeg"));


                JLabel backgroundLabel = new JLabel(backgroundImage);
                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

             
                JPanel panel = new JPanel(null);
                panel.setOpaque(false); 
                panel.setBounds(0, 0, getWidth(), getHeight());
                
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

                    	JLayeredPane layeredPane = new JLayeredPane();
                        getContentPane().add(layeredPane);

                        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/assemble.jpeg"));


                        JLabel backgroundLabel = new JLabel(backgroundImage);
                        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

                     
                        JPanel panel = new JPanel(null);
                        panel.setOpaque(false); 
                        panel.setBounds(0, 0, getWidth(), getHeight());
                        
                        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

                    	JLayeredPane layeredPane = new JLayeredPane();
                        getContentPane().add(layeredPane);

                        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/assemble.jpeg"));


                        JLabel backgroundLabel = new JLabel(backgroundImage);
                        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

                     
                        JPanel panel = new JPanel(null);
                        panel.setOpaque(false); 
                        panel.setBounds(0, 0, getWidth(), getHeight());
                        
                        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

     	JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/thor.jpeg"));


        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

     
        JPanel panel = new JPanel(null);
        panel.setOpaque(false); 
        panel.setBounds(0, 0, getWidth(), getHeight());
        
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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
         findLokiBtn.setBounds(320, 70, 170, 30);
         panel.add(findLokiBtn);

         fightWithThorBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 getContentPane().removeAll(); 

             	JLayeredPane layeredPane = new JLayeredPane();
                getContentPane().add(layeredPane);

                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/assemble.jpeg"));


                JLabel backgroundLabel = new JLabel(backgroundImage);
                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

             
                JPanel panel = new JPanel(null);
                panel.setOpaque(false); 
                panel.setBounds(0, 0, getWidth(), getHeight());
                
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

             	JLayeredPane layeredPane = new JLayeredPane();
                getContentPane().add(layeredPane);

                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/assemble.jpeg"));


                JLabel backgroundLabel = new JLabel(backgroundImage);
                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

             
                JPanel panel = new JPanel(null);
                panel.setOpaque(false); 
                panel.setBounds(0, 0, getWidth(), getHeight());
                
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

    	JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/capusa.jpeg"));


        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

     
        JPanel panel = new JPanel(null);
        panel.setOpaque(false); 
        panel.setBounds(0, 0, getWidth(), getHeight());
        
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

            	JLayeredPane layeredPane = new JLayeredPane();
                getContentPane().add(layeredPane);

                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/assemble.jpeg"));


                JLabel backgroundLabel = new JLabel(backgroundImage);
                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

             
                JPanel panel = new JPanel(null);
                panel.setOpaque(false); 
                panel.setBounds(0, 0, getWidth(), getHeight());
                
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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

            	JLayeredPane layeredPane = new JLayeredPane();
                getContentPane().add(layeredPane);

                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/assemble.jpeg"));


                JLabel backgroundLabel = new JLabel(backgroundImage);
                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

             
                JPanel panel = new JPanel(null);
                panel.setOpaque(false); 
                panel.setBounds(0, 0, getWidth(), getHeight());
                
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

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
    
    
    
    
    
    
    
    private void endgame() {
    	getContentPane().removeAll();

    	JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/endgame.jpeg"));


        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

     
        JPanel panel = new JPanel(null);
        panel.setOpaque(false); 
        panel.setBounds(0, 0, getWidth(), getHeight());
        
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

        JLabel label = new JLabel("YOU HAVE DEFEATED THANOS AND BROUGHT BACK HUMANITY!");
        label.setBounds(10, 10, 600, 20);
        panel.add(label);
        
        JLabel label1 = new JLabel("YOU ARE THE NEW SUPERHERO OF EARTH!!");
        label1.setBounds(10, 30, 600, 20);
        panel.add(label1);
        
        JLabel label2 = new JLabel("CONGRATULATIONS !! MISSION SUCCESSFUL !!");
        label2.setBounds(10, 80, 600, 20);
        panel.add(label2);
        
        setVisible(true);
    }
    
    
    private void assembleAvengers() {
    	getContentPane().removeAll();

    	JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/thanos.jpeg"));


        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

     
        JPanel panel = new JPanel(null);
        panel.setOpaque(false); 
        panel.setBounds(0, 0, getWidth(), getHeight());
        
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

        JLabel label = new JLabel("Avengers have been assembled!");
        label.setBounds(10, 10, 600, 20);
        panel.add(label);
        
        JLabel label1 = new JLabel("There is a new threat incoming - THANOS ! To defeat Thanos, what is your next priority step?");
        label1.setBounds(10, 40, 600, 20);
        panel.add(label1);
        
        JButton gatherOthers = new JButton("Gather Other Avengers");
        gatherOthers.setBounds(10, 90, 250, 30);
        panel.add(gatherOthers);

        JButton gatherStones = new JButton("Hunt Infinity Stones");
        gatherStones.setBounds(300, 90, 200, 30);
        panel.add(gatherStones);
        
        
        gatherOthers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll(); 

            	JLayeredPane layeredPane = new JLayeredPane();
                getContentPane().add(layeredPane);

                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/thanosnap.jpeg"));


                JLabel backgroundLabel = new JLabel(backgroundImage);
                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

             
                JPanel panel = new JPanel(null);
                panel.setOpaque(false); 
                panel.setBounds(0, 0, getWidth(), getHeight());
                
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

                JLabel label = new JLabel("You have successfully gathered SpiderMan, Black Panter, Hulk and Ms Marvel!!");
                label.setBounds(10, 10, 600, 20);
                panel.add(label);

                JLabel missionLabel = new JLabel("Meanwhile Thanos has sacrificed Gamora to gather all Infinity Stones!!");
                missionLabel.setBounds(10, 40, 600, 20);
                panel.add(missionLabel);
                
                JLabel missionLabel1 = new JLabel("Thanos is about to SNAP !!  ");
                missionLabel1.setBounds(10, 60, 600, 20);
                panel.add(missionLabel1);
                
                JLabel missionLabel12 = new JLabel("Sacrifice yourself instead of IronMan or get Dr. Strange for Help.");
                missionLabel12.setBounds(10, 90, 600, 20);
                panel.add(missionLabel12);

                JButton stopsnapBtn = new JButton("Sacrifice");
                stopsnapBtn.setBounds(10, 120, 220, 30);
                panel.add(stopsnapBtn);
                
                JButton callstrangeBtn = new JButton("Call Dr. Strange!");
                callstrangeBtn.setBounds(400, 120, 180, 30);
                panel.add(callstrangeBtn);

                stopsnapBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	endgame();
                    }
                });
                
                callstrangeBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	getContentPane().removeAll(); 

                    	JLayeredPane layeredPane = new JLayeredPane();
                        getContentPane().add(layeredPane);

                        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/strange.jpeg"));


                        JLabel backgroundLabel = new JLabel(backgroundImage);
                        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

                     
                        JPanel panel = new JPanel(null);
                        panel.setOpaque(false); 
                        panel.setBounds(0, 0, getWidth(), getHeight());
                        
                        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

                        JLabel labelY = new JLabel("You and Dr. Strange will now attempt time travel to undo Thanos's snap!");
                        labelY.setBounds(10, 10, 600, 20);
                        panel.add(labelY);

                        JLabel missionLabelY = new JLabel("You have successfully visited past self of Thanos!!");
                        missionLabelY.setBounds(10, 40, 600, 20);
                        panel.add(missionLabelY);
                        
                        JButton killthanosBtn = new JButton("You Kill Thanos !!");
                        killthanosBtn.setBounds(10, 70, 160, 30);
                        panel.add(killthanosBtn);
                        
                        JButton gloveBtn = new JButton("Take back the Glove!");
                        gloveBtn.setBounds(170, 70, 190, 30);
                        panel.add(gloveBtn);
                        
                        killthanosBtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                            	endgame();
                            }
                        });
                        
                        gloveBtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                            	getContentPane().removeAll(); 

                            	JLayeredPane layeredPane = new JLayeredPane();
                                getContentPane().add(layeredPane);

                                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/snap.jpeg"));


                                JLabel backgroundLabel = new JLabel(backgroundImage);
                                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

                             
                                JPanel panel = new JPanel(null);
                                panel.setOpaque(false); 
                                panel.setBounds(0, 0, getWidth(), getHeight());
                                
                                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

                                JLabel labelX = new JLabel("You snatch back the Glove from Thanos to undo the damage & bring everyone back !!! ");
                                labelX.setBounds(10, 10, 600, 20);
                                panel.add(labelX);
                                
                                JButton snapBtn = new JButton("SNAP!");
                                snapBtn.setBounds(10, 70, 220, 30);
                                panel.add(snapBtn);
                                
                                snapBtn.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                    	endgame();
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
        });

        
        gatherStones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll(); 

            	JLayeredPane layeredPane = new JLayeredPane();
                getContentPane().add(layeredPane);

                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/stones.jpeg"));


                JLabel backgroundLabel = new JLabel(backgroundImage);
                backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

             
                JPanel panel = new JPanel(null);
                panel.setOpaque(false); 
                panel.setBounds(0, 0, getWidth(), getHeight());
                
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

                JLabel label = new JLabel("You are on a mission to gather all stones !!");
                label.setBounds(10, 10, 600, 20);
                panel.add(label);

                JLabel missionLabel = new JLabel("Get help from all the avengers to gather all stones!!");
                missionLabel.setBounds(10, 40, 600, 20);
                panel.add(missionLabel);

                

                
                JButton callstrangeBtn = new JButton("Collect Stones!");
                callstrangeBtn.setBounds(10, 80, 180, 30);
                panel.add(callstrangeBtn);


                
                callstrangeBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	getContentPane().removeAll(); 

                    	JLayeredPane layeredPane = new JLayeredPane();
                        getContentPane().add(layeredPane);

                        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/arju_storyline/snap.jpeg"));


                        JLabel backgroundLabel = new JLabel(backgroundImage);
                        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());

                     
                        JPanel panel = new JPanel(null);
                        panel.setOpaque(false); 
                        panel.setBounds(0, 0, getWidth(), getHeight());
                        
                        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
                        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);
	
	 
	
	
	                        JLabel labelX = new JLabel("You have collected all the stones and now Infinity Glove is in your hand !!! ");
	                        labelX.setBounds(10, 10, 600, 20);
	                        panel.add(labelX);
	                        

	                    	
	                        JLabel labely = new JLabel("Snap to kill THANOS!!! ");
	                        labely.setBounds(10, 40, 600, 20);
	                        panel.add(labely);
	                        
	                        JButton snapBtn = new JButton("SNAP!");
	                        snapBtn.setBounds(10, 70, 220, 30);
	                        panel.add(snapBtn);
	                            
	                        snapBtn.addActionListener(new ActionListener() {
	                            @Override
	                            public void actionPerformed(ActionEvent e) {
	                            	endgame();
	                            }
	                        });
                            
                            setVisible(true);
                        }
                    });
                        
                        setVisible(true);
                        
   
                
                

                
                
                setVisible(true);
            }
        });



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