/*
Modify the Java project so that clicking on an icon opens that specific subject's
details (preferably using the results of your previous Exercise). Also, add a detail
to the search box such that if the Subject does not exist, a dialog box appears to
inform the user of such.
*/

package exercise14muonmulsidamber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SubjectInstance extends JFrame implements ActionListener, KeyListener{    
    private JPanel main, northPanel, southPanel;
    private JLabel name, sampleImage, units, grade, warning;
    public ImageIcon img;
    private JButton search, next, previous, back;
    private JTextField text;
    private int current;
    public static Subject displayedSubject;
    
    public SubjectInstance(){
        super("Subject");
                
        name = new JLabel(displayedSubject.getName());
        sampleImage = new JLabel();
        img = new ImageIcon(SubjectInstance.class.getResource(displayedSubject.getImgFileName()));
        units = new JLabel(Double.toString(displayedSubject.getUnits()));
        grade = new JLabel(Double.toString(displayedSubject.getGrade()));
        warning = new JLabel("");
        next = new JButton("Next");
        previous = new JButton("Previous");
        back = new JButton("Back");
        search = new JButton("Search");
        text = new JTextField(10);
        
        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.add(name);
        northPanel.add(sampleImage);
        northPanel.add(units);
        northPanel.add(grade);
        
        main = new JPanel();
        main.setLayout(new FlowLayout(FlowLayout.CENTER));
        main.add(text);
        main.add(search);
        main.add(warning);
        
        next.addActionListener(this);
        previous.addActionListener(this);
        back.addActionListener(this);
        search.addActionListener(this);
        text.addKeyListener(this);
        
        southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        southPanel.add(previous);
        southPanel.add(back);
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
        this.setSize(300, 240);
        this.setLayout(new BorderLayout(10, 10));
        this.add(northPanel, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent a){
        int max = Subject.getListLength()-1;
        current = displayedSubject.getSubjectIndex(displayedSubject);
        
        if (a.getSource() == next){
            if (current < max){
                warning.setText("");
                current++;
                displayedSubject = Subject.subjectList.get(current);
                name.setText(displayedSubject.getName());
                sampleImage = new JLabel();
                Image newImg = new ImageIcon(SubjectInstance.class.getResource(displayedSubject.getImgFileName())).getImage();
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
                Image newImg = new ImageIcon(SubjectInstance.class.getResource(displayedSubject.getImgFileName())).getImage();
                img.setImage(newImg); 
                units.setText(Double.toString(displayedSubject.getUnits())); 
                grade.setText(Double.toString(displayedSubject.getGrade())); 
            }
        } else if (a.getSource() == back) {
            this.dispose();
            new Menu();
        } else if (a.getSource() == search){
            String choice = text.getText();
             
            try {
                displayedSubject = Subject.searchSubject(choice);
                name.setText(displayedSubject.getName());
                sampleImage = new JLabel();
                Image newImg = new ImageIcon(SubjectInstance.class.getResource(displayedSubject.getImgFileName())).getImage();
                img.setImage(newImg); 
                units.setText(Double.toString(displayedSubject.getUnits())); 
                grade.setText(Double.toString(displayedSubject.getGrade()));
            } catch(NullPointerException e) {
                warning.setText("");
                JOptionPane.showMessageDialog(this, "Subject does not exist.", "Invalid subject", JOptionPane.INFORMATION_MESSAGE);
            }
            
            text.setText("");
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}