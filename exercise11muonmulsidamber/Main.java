/*
Create a user interface so that the name, image logo, units, and grade of a single subject are displayed.
Include a button that says "Next". Write the code in such a way that displayed subject can be changed by changing a single variable in the code. 
*/

package exercise11muonmulsidamber;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        Subject displayedSubject = bio;
        
        JFrame window = new JFrame("Subject");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,450);
        
        window.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JLabel name = new JLabel(displayedSubject.getName());
        name.setForeground(Color.black);
        name.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        window.add(name);
        
        JLabel sampleImage = new JLabel();
        ImageIcon img = new ImageIcon(Main.class.getResource(displayedSubject.getImgFileName()));
        sampleImage.setIcon(img);
        window.add(sampleImage);
        
        JLabel units = new JLabel(Double.toString(displayedSubject.getUnits()));
        units.setForeground(Color.black);
        units.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        window.add(units);
        
        JLabel grade = new JLabel(Double.toString(displayedSubject.getGrade()));
        grade.setForeground(Color.black);
        grade.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        window.add(grade);
        
        JButton button = new JButton("Next");
        button.setHorizontalTextPosition(JButton.LEFT);
        window.add(button);
        
        window.setVisible(true);
    }
    
}
