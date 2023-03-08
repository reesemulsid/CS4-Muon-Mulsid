// Create a more complex layout by implementing at least two different layouts in a single frame.

package exercise12muonmulsidamber;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        Subject displayedSubject = chem;
        
        JFrame window = new JFrame("Subject");
        
        JPanel main, northPanel, southPanel;
        
        JLabel name = new JLabel(displayedSubject.getName());
        JLabel sampleImage = new JLabel();
        JLabel units = new JLabel(Double.toString(displayedSubject.getUnits()));
        JLabel grade = new JLabel(Double.toString(displayedSubject.getGrade()));
        JButton button = new JButton("Next");
        
        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.add(name);
        northPanel.add(sampleImage);
        
        main = new JPanel();
        main.setLayout(new FlowLayout(FlowLayout.CENTER));
        main.add(units);
        main.add(grade);
        
        southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        southPanel.add(button);
        
        name.setForeground(Color.black);
        name.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        
        ImageIcon img = new ImageIcon(Main.class.getResource(displayedSubject.getImgFileName()));
        sampleImage.setLayout(new FlowLayout(FlowLayout.CENTER));
        sampleImage.setIcon(img);
        
        units.setLayout(new FlowLayout(FlowLayout.CENTER));
        units.setForeground(Color.black);
        units.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        
        grade.setLayout(new FlowLayout(FlowLayout.CENTER));
        grade.setForeground(Color.black);
        grade.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        
        button.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(250,210);
        window.setLayout(new BorderLayout(10, 10));
        window.add(northPanel, BorderLayout.NORTH);
        window.add(main, BorderLayout.CENTER);
        window.add(southPanel, BorderLayout.SOUTH);
        window.setVisible(true);
    }
    
}
