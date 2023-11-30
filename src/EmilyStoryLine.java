import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmilyStoryLine {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cat Adoption Storyline");
        JLabel label = new JLabel("<html>You enter a room with two adorable cats.<br>One is black and the other is orange.<br>Which one will you choose?</html>");
        label.setBounds(100, 50, 400, 100);
        frame.add(label);

        JButton blackCatButton = new JButton("Choose the Black Cat");
        JButton orangeCatButton = new JButton("Choose the Orange Cat");
        blackCatButton.setBounds(100, 150, 200, 50);
        orangeCatButton.setBounds(300, 150, 200, 50);

        blackCatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseCat("Black", frame);
            }
        });

        orangeCatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseCat("Orange", frame);
            }
        });

        frame.add(blackCatButton);
        frame.add(orangeCatButton);
        frame.setSize(600, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private static void chooseCat(String color, JFrame previousFrame) {
        previousFrame.dispose(); // Close the previous window

        JFrame nameFrame = new JFrame("Name Your " + color + " Cat");
        JLabel nameLabel = new JLabel("What will you name your " + color.toLowerCase() + " cat?");
        nameLabel.setBounds(50, 50, 300, 50);
        nameFrame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(50, 100, 200, 50);
        nameFrame.add(nameField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(50, 160, 100, 50);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String catName = nameField.getText();
                JOptionPane.showMessageDialog(nameFrame, "Congratulations! Your " + color.toLowerCase() + " cat is now named " + catName + "!");
            }
        });

        nameFrame.add(submitButton);
        nameFrame.setSize(400, 300);
        nameFrame.setLayout(null);
        nameFrame.setVisible(true);
    }
}
