import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PanelLauncher extends JFrame {

    private JPanel panel0;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    private JPanel panel10;
    private JPanel gameOverPanel;
    private int healthPoints = 100; // Initialize healthPoints to 100
    JLabel healthLabel1;
    JLabel healthLabel2;
    JLabel healthLabel3;
    JLabel healthLabel4;
    JLabel healthLabel5;
    JLabel healthLabel6;
    JLabel healthLabel7;
    JLabel healthLabel8;
    JLabel healthLabel9;

    public PanelLauncher() {
        panel0 = new StartPanel();
        panel1 = new FirstPanel();
        panel2 = new SecondPanel();
        panel3 = new ThirdPanel();
        panel4 = new FourthPanel();
        panel5 = new FifthPanel();
        panel6 = new SixthPanel();
        panel7 = new SeventhPanel();
        panel8 = new EighthPanel();
        panel9 = new NinthPanel();
        panel10 = new LastPanel();
        gameOverPanel = new GameOverPanel();

        setPreferredSize(new Dimension(669, 455)); // Increased the height to accommodate health points
        setLayout(new CardLayout());

        add(panel0, "Panel0");
        add(panel1, "panel1");
        add(panel2, "panel2");
        add(panel3, "panel3");
        add(panel4, "panel4");
        add(panel5, "panel5");
        add(panel6, "panel6");
        add(panel7, "panel7");
        add(panel8, "panel8");
        add(panel9, "panel9");
        add(panel10, "panel10");
        add(gameOverPanel, "gameOverPanel");

        showPanel("panel0");

    }

    private void showPanel(String panelName) {
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), panelName);
    }

    public static void main(String[] args) {
        PanelLauncher frame = new PanelLauncher();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
      
       
       

       

      ImageIcon image = new ImageIcon("C:/Users/vidya/Downloads/VIDS GAME.png");
      frame.setIconImage(image.getImage());


    }

public class StartPanel extends JPanel {
    private JLabel imageLabel;
    private JTextArea jcomp1;
    private JButton jcomp5;

    public StartPanel() {
        // Construct components
        imageLabel = new JLabel();
        jcomp1 = new JTextArea();
        jcomp5 = new JButton("START");

        // Set layout to BorderLayout
        setLayout(new BorderLayout());

        // Create a container JPanel to hold the components vertically centered
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(10, 10, 10, 10);

        // Add imageLabel to the container panel
        constraints.gridx = 2;
        constraints.gridy = 0;
        containerPanel.add(imageLabel, constraints);

        // Add jcomp1 to the container panel
        constraints.gridy = 1;
        containerPanel.add(jcomp1, constraints);

        // Set properties for the JTextArea (jcomp1)
        jcomp1.setText("Hey Pal! Vidya welcomes you to the FIND THE KEY game.YOU ARE LOCKED IN A ROOM. Answer the questions, find the key to the door and escape.\n" +
                "Rules are simple: give correct answers to get +13 health points, wrong answers deduct -50 health points. If you fail any of the challenges, it's not too late to start again! ;-) ");
        jcomp1.setWrapStyleWord(true);
        jcomp1.setLineWrap(true);
        jcomp1.setEditable(false);
        jcomp1.setBackground(new Color(0, 0, 0, 0));
       
        jcomp1.setFont(new Font("Arial", Font.PLAIN, 16));

        // Add the container panel to the center of StartPanel
        add(containerPanel, BorderLayout.CENTER);

        // Add jcomp5 to the south of StartPanel
        add(jcomp5, BorderLayout.SOUTH);

        // Set the image for imageLabel
        ImageIcon imageIcon = new ImageIcon("C:/Users/vidya/Desktop/findthekey.jpeg");
        imageLabel.setIcon(imageIcon);

        // Add action listener to jcomp5
        jcomp5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanel("panel1");
            }
        });
    }


}

    private class GameOverPanel extends JPanel {

        public GameOverPanel() {
           


               ImageIcon image = new ImageIcon("C:/Users/vidya/Desktop/gameover.png");
       
        JLabel label = new JLabel("     YOU ARE DEAD !! ", image, JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(-5);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Georgia", Font.BOLD, 30));
       
        setLayout(new BorderLayout());  // Set the layout manager to BorderLayout
        add(label, BorderLayout.CENTER); // Add the label to the center of the panel
       
        
        }
    }

    private class FirstPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JButton jcomp6;
        // private JLabel healthLabel1;

        public FirstPanel() {
            // Construct components
            jcomp1 = new JButton("1. Polymorphism");
            jcomp2 = new JButton("2. Inheritance");
            jcomp3 = new JButton("3. Abstraction");
            jcomp4 = new JLabel("Which of the following concepts promotes the idea of 'code once, reuse many times'? ");
            jcomp5 = new JLabel("");
            healthLabel1 = new JLabel("Health Points: " + healthPoints);
            jcomp6 = new JButton("Back");


            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            add(healthLabel1);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(205, 145, 275, 20);
            jcomp2.setBounds(205, 180, 275, 20);
            jcomp3.setBounds(205, 210, 275, 20);
            jcomp4.setBounds(95, 100, 900, 20);
            jcomp5.setBounds(120, 35, 525, 20);
            jcomp6.setBounds(500, 345, 80, 30);
            healthLabel1.setBounds(50, 360, 200, 20); // Added healthLabel position
 
             
            jcomp6.addActionListener(new ActionListener() {
                // Back Button
                public void actionPerformed(ActionEvent e) {
                    showPanel("Panel0");
                }
            });

            jcomp2.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    showPanel("panel2");
                }
            });
            jcomp1.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50; // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp3.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
        }
    }

    private class SecondPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;
        // private JLabel healthLabel2;
        // private int healthPoints = 100; // Initial health points

        public SecondPanel() {
            // Construct components
            jcomp1 = new JButton("1. It cannot be instantiated but provides a common base for subclasses");
            jcomp2 = new JButton("2.  It is a final class that cannot be extended");
            jcomp3 = new JButton("3.  It is a class with only static methods and variables");
            jcomp4 = new JLabel("Good start !");
            jcomp5 = new JLabel("Which of the following best describes the purpose of an abstract class in Java ?");
            jcomp6 = new JLabel("");
            healthLabel2 = new JLabel("Health Points: " + healthPoints);

            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            add(healthLabel2);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(100, 145, 475, 20);
            jcomp2.setBounds(100, 180, 475, 20);
            jcomp3.setBounds(100, 215, 475, 20);
            jcomp4.setBounds(285, 50, 185, 15);
            jcomp5.setBounds(100, 80, 485, 20);
            jcomp6.setBounds(250, 180, 275, 25);
            healthLabel2.setBounds(50, 360, 200, 20); // Added healthLabel position
            jcomp1.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    showPanel("panel3");
                }
            });
            jcomp2.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                   healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    // showPanel("panel1");
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp3.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });

        }
    }

    private class ThirdPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;
       
        // private JLabel healthLabel3;

        public ThirdPanel() {
            // Construct components
            jcomp1 = new JButton("1.  Object encapsulation");
            jcomp2 = new JButton("2.  Object composition");
            jcomp3 = new JButton("3.  Object polymorphism");
            jcomp4 = new JLabel("");
            jcomp5 = new JLabel("In object-oriented programming, ");
            jcomp6 = new JLabel("what is the term used to describe the ability of an object to contain instances of other objects?");
           
            healthLabel3 = new JLabel("Health Points: " + healthPoints);

            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            
            add(healthLabel3);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(205, 145, 275, 20);
            jcomp2.setBounds(205, 180, 275, 20);
            jcomp3.setBounds(205, 215, 275, 20);
            jcomp4.setBounds(220, 20, 235, 20);
            jcomp5.setBounds(255, 27, 385, 20);
            jcomp6.setBounds(80, 30, 600, 100);
      
            healthLabel3.setBounds(50, 360, 200, 20); // Added healthLabel position

            jcomp2.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    showPanel("panel4");
                }
            });
            jcomp1.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                     healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp3.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
        }
    }

    private class FourthPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;

        // private int healthPoints = 100; // Initial health points

        public FourthPanel() {
            // Construct components
            jcomp1 = new JButton("1. Concrete class");
            jcomp2 = new JButton("2. Static class");
            jcomp3 = new JButton("3.  Sealed class");
            jcomp4 = new JLabel("What is the term used to describe a class that is derived from an abstract class and ");
            jcomp5 = new JLabel("provides implementation for all its abstract methods?");
            jcomp6 = new JLabel(" ");
            healthLabel4 = new JLabel("Health Points: " + healthPoints);

            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            add(healthLabel4);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(205, 145, 275, 20);
            jcomp2.setBounds(205, 180, 275, 20);
            jcomp3.setBounds(205, 215, 275, 20);
            jcomp4.setBounds(100, 40, 985, 15);
            jcomp5.setBounds(200, 60, 385, 20);
            jcomp6.setBounds(250, 75, 275, 25);
            healthLabel4.setBounds(50, 360, 200, 20); // Added healthLabel position
            jcomp1.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    showPanel("panel5");
                }
            });
            jcomp2.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                     healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp3.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });

        }
    }

    private class FifthPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;
        // private JLabel healthLabel2;
        // private int healthPoints = 100; // Initial health points

        public FifthPanel() {
            // Construct components
            jcomp1 = new JButton("1. final");
            jcomp2 = new JButton("2. abstract");
            jcomp3 = new JButton("3. static");
            jcomp4 = new JLabel("");
            jcomp5 = new JLabel("In Java, ");
            jcomp6 = new JLabel(" which keyword is used to prevent a method from being overridden in a subclass?");
            healthLabel5 = new JLabel("Health Points: " + healthPoints);

            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            add(healthLabel5);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(205, 145, 275, 20);
            jcomp2.setBounds(205, 180, 275, 20);
            jcomp3.setBounds(205, 215, 275, 20);
            jcomp4.setBounds(240, 10, 185, 15);
            jcomp5.setBounds(315, 30, 385, 20);
            jcomp6.setBounds(100, 55, 675, 25);
            healthLabel5.setBounds(50, 360, 200, 20); // Added healthLabel position
            jcomp1.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    showPanel("panel6");
                }
            });
            jcomp2.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50; // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp3.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50; // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });

        }
    }

    private class SixthPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;
        // private JLabel healthLabel2;
        // private int healthPoints = 100; // Initial health points

        public SixthPanel() {
            // Construct components
            jcomp1 = new JButton("1. Inheritance");
            jcomp2 = new JButton("2. Polymorphism");
            jcomp3 = new JButton("3. Encapsulation");
            jcomp4 = new JLabel("");
            jcomp5 = new JLabel("What is the term used to describe the ability of an object to exhibit ");
            jcomp6 = new JLabel("different behaviors based on its data type? ");
            healthLabel6 = new JLabel("Health Points: " + healthPoints);

            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            add(healthLabel6);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(205, 145, 275, 20);
            jcomp2.setBounds(205, 180, 275, 20);
            jcomp3.setBounds(205, 215, 275, 20);
            jcomp4.setBounds(240, 10, 185, 15);
            jcomp5.setBounds(150, 30, 685, 20);
            jcomp6.setBounds(205, 45, 275, 25);
            healthLabel6.setBounds(50, 360, 200, 20); // Added healthLabel position
            jcomp2.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    showPanel("panel7");
                }
            });
            jcomp1.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp3.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50; // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });

        }
    }

    private class SeventhPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;
        // private JLabel healthLabel2;
        // private int healthPoints = 100; // Initial health points

        public SeventhPanel() {
            // Construct components
            jcomp1 = new JButton("1. Object instantiation");
            jcomp2 = new JButton("2. Object aggregation");
            jcomp3 = new JButton("3. Object composition");
            jcomp4 = new JLabel("");
            jcomp5 = new JLabel("What is the term used to describe the process of creating objects of a class within the same class?");
            jcomp6 = new JLabel(" ");
            healthLabel7 = new JLabel("Health Points: " + healthPoints);

            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            add(healthLabel7);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(205, 145, 275, 20);
            jcomp2.setBounds(205, 180, 275, 20);
            jcomp3.setBounds(205, 215, 275, 20);
            jcomp4.setBounds(240, 10, 185, 15);
            jcomp5.setBounds(80, 60, 685, 20);
            jcomp6.setBounds(250, 55, 275, 25);
            healthLabel7.setBounds(50, 360, 200, 20); // Added healthLabel position
            jcomp3.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    showPanel("panel8");
                }
            });
            jcomp1.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp2.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });

        }
    }

    private class EighthPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;
        // private JLabel healthLabel2;
        // private int healthPoints = 100; // Initial health points

        public EighthPanel() {
            // Construct components
            jcomp1 = new JButton("1.int");
            jcomp2 = new JButton("2. double");
            jcomp3 = new JButton("3. class");
            jcomp4 = new JLabel("");
            jcomp5 = new JLabel("In Java, which of the following is NOT a primitive data type?");
            jcomp6 = new JLabel(" ");
            healthLabel8 = new JLabel("Health Points: " + healthPoints);

            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            add(healthLabel8);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(205, 145, 275, 20);
            jcomp2.setBounds(205, 180, 275, 20);
            jcomp3.setBounds(205, 215, 275, 20);
            jcomp4.setBounds(240, 10, 185, 15);
            jcomp5.setBounds(165, 30, 385, 20);
            jcomp6.setBounds(250, 55, 275, 25);
            healthLabel8.setBounds(50, 360, 200, 20); // Added healthLabel position
            jcomp3.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    showPanel("panel9");
                }
            });
            jcomp2.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                     healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp1.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                     healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });

        }
    }

    private class NinthPanel extends JPanel {
        private JButton jcomp1;
        private JButton jcomp2;
        private JButton jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;

        // private int healthPoints = 100; // Initial health points

        public NinthPanel() {
            // Construct components
            jcomp1 = new JButton("1. 200");
            jcomp2 = new JButton("2. do sarkar ");
            jcomp3 = new JButton("3. I give up");
            jcomp4 = new JLabel("This is the password question.");
            jcomp5 = new JLabel("Kitne AADMI the??");
            jcomp6 = new JLabel(" ");
            healthLabel9 = new JLabel("Health Points: " + healthPoints);

            // Adjust size and set layout
            setPreferredSize(new Dimension(669, 395));
            setLayout(null);

            // Add components
            add(jcomp1);
            add(jcomp2);
            add(jcomp3);
            add(jcomp4);
            add(jcomp5);
            add(jcomp6);
            add(healthLabel9);

            // Set component bounds (only needed by Absolute Positioning)
            jcomp1.setBounds(205, 145, 275, 20);
            jcomp2.setBounds(205, 180, 275, 20);
            jcomp3.setBounds(205, 215, 275, 20);
            jcomp4.setBounds(260, 50, 185, 15);
            jcomp5.setBounds(300, 80, 385, 20);
            jcomp6.setBounds(250, 55, 275, 25);
            healthLabel9.setBounds(50, 360, 200, 20); // Added healthLabel position
            jcomp2.addActionListener(new ActionListener() {
                // Correct Answer
                public void actionPerformed(ActionEvent e) {
                    healthPoints += 13; // Add 13 health points for the correct answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("YOU WON BY  " + healthPoints + "POINTS");
                    showPanel("panel10");
                }
            });
            jcomp1.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                     healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });
            jcomp3.addActionListener(new ActionListener() {
                // Wrong Answer
                public void actionPerformed(ActionEvent e) {
                     healthPoints -= 50;  // Remove 30 health points for the wrong answer
                    healthLabel1.setText("Health Points: " + healthPoints);
                    healthLabel2.setText("Health Points: " + healthPoints);
                    healthLabel3.setText("Health Points: " + healthPoints);
                    healthLabel4.setText("Health Points: " + healthPoints);
                    healthLabel5.setText("Health Points: " + healthPoints);
                    healthLabel6.setText("Health Points: " + healthPoints);
                    healthLabel7.setText("Health Points: " + healthPoints);
                    healthLabel8.setText("Health Points: " + healthPoints);
                    healthLabel9.setText("Health Points: " + healthPoints);
                    if (healthPoints <= 0) {
                        showPanel("gameOverPanel"); // Redirect to Game Over panel
                    } else {
                        showPanel("panel1");
                    }
                }
            });

        }
    }

private class LastPanel extends JPanel {
    public LastPanel() {
        healthLabel9 = new JLabel("SCORE : " + healthPoints);
        healthLabel9.setForeground(Color.WHITE);
        healthLabel9.setBounds(250, 300, 200, 30);
        ImageIcon image = new ImageIcon("C:/Users/vidya/Downloads/won3.png");
        Font menuFont = healthLabel9.getFont();
        healthLabel9.setFont(menuFont.deriveFont(20f));
        JLabel lab = new JLabel("You won by " + healthPoints + " Points");
        
        lab.setHorizontalTextPosition(JLabel.CENTER);
        lab.setVerticalTextPosition(JLabel.TOP);
        lab.setIconTextGap(15);
        JLabel label = new JLabel("Congrats! You found the key little OOP expert !!",image, JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(25);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        setLayout(new BorderLayout());
        add(healthLabel9);
        add(label, BorderLayout.CENTER);
        setBackground(Color.BLACK);
    }
}
  
}
