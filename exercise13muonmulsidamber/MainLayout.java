/*
* a "Next" and "Previous" button
    * that changes the displayed details to the next/previous subject in the subject list
    * that disables the corresponding button when at either the first or last subject in the list
* a text field and "Search" button
    * that given the name of a subject would display the corresponding details
    * in the case that the subject doesn't exist, a text/label informs the user of such
*/

package exercise13muonmulsidamber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainLayout extends JFrame implements ActionListener, KeyListener{    
    private JPanel main, northPanel, southPanel;
    private JLabel name, sampleImage, units, grade, warning;
    private ImageIcon img;
    private JButton next, previous, search;
    private JTextField text;
    private int current;
    private Subject displayedSubject;
    
    public static void main(String[] args) {  
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);  
        
        JFrame window = new MainLayout();
    }
    
    public MainLayout(){
        super("Subject");
        
        displayedSubject = Subject.subjectList.get(current);
                
        name = new JLabel(displayedSubject.getName());
        sampleImage = new JLabel();
        img = new ImageIcon(MainLayout.class.getResource(displayedSubject.getImgFileName()));
        units = new JLabel(Double.toString(displayedSubject.getUnits()));
        grade = new JLabel(Double.toString(displayedSubject.getGrade()));
        warning = new JLabel("");
        next = new JButton("Next");
        previous = new JButton("Previous");
        search = new JButton("Search");
        text = new JTextField(10);
        
        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.add(name);
        northPanel.add(sampleImage);
        
        main = new JPanel();
        main.setLayout(new FlowLayout(FlowLayout.CENTER));
        main.add(units);
        main.add(grade);
        main.add(text);
        main.add(search);
        main.add(warning);
        
        next.addActionListener(this);
        previous.addActionListener(this);
        search.addActionListener(this);
        text.addKeyListener(this);
        
        southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        southPanel.add(previous);
        southPanel.add(next);
        
        name.setForeground(Color.black);
        name.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        
        sampleImage.setLayout(new FlowLayout(FlowLayout.CENTER));
        sampleImage.setIcon(img);
        
        units.setLayout(new FlowLayout(FlowLayout.CENTER));
        units.setForeground(Color.black);
        units.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        
        grade.setLayout(new FlowLayout(FlowLayout.CENTER));
        grade.setForeground(Color.black);
        grade.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,300);
        this.setLayout(new BorderLayout(10, 10));
        this.add(northPanel, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent a){
        int max = Subject.getListLength()-1;
        
        if (a.getSource() == next){
            if (current < max){
                warning.setText("");
                current++;
                displayedSubject = Subject.subjectList.get(current);
                name.setText(displayedSubject.getName());
                sampleImage = new JLabel();
                Image newImg = new ImageIcon(MainLayout.class.getResource(displayedSubject.getImgFileName())).getImage();
                img.setImage(newImg);
                units.setText(Double.toString(displayedSubject.getUnits()));
                grade.setText(Double.toString(displayedSubject.getGrade()));
            } else {
                warning.setText("No more subjects in the list.");
            }
        } else if (a.getSource() == previous){
            if (current == 0){
                warning.setText("No more subjects in the list.");
            } else{
                warning.setText("");
                current--;
                displayedSubject = Subject.subjectList.get(current);
                name.setText(displayedSubject.getName());
                sampleImage = new JLabel();
                Image newImg = new ImageIcon(MainLayout.class.getResource(displayedSubject.getImgFileName())).getImage();
                img.setImage(newImg); 
                units.setText(Double.toString(displayedSubject.getUnits())); 
                grade.setText(Double.toString(displayedSubject.getGrade())); 
            }
        } else if (a.getSource() == search){
            String choice = text.getText();
             
            try {
                displayedSubject = Subject.searchSubject(choice);
                name.setText(displayedSubject.getName());
                sampleImage = new JLabel();
                Image newImg = new ImageIcon(MainLayout.class.getResource(displayedSubject.getImgFileName())).getImage();
                img.setImage(newImg); 
                units.setText(Double.toString(displayedSubject.getUnits())); 
                grade.setText(Double.toString(displayedSubject.getGrade()));
            } catch(NullPointerException e) {
                warning.setText("Subject does not exist.");
            }
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
