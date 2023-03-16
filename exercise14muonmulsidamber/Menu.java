/*
Modify the Java project so that clicking on an icon opens that specific subject's
details (preferably using the results of your previous Exercise). Also, add a detail
to the search box such that if the Subject does not exist, a dialog box appears to
inform the user of such.
*/

package exercise14muonmulsidamber;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Menu extends JFrame implements MouseListener, ActionListener{
    private ArrayList<JLabel> iconList;
    private JButton prev, next;
    private ImageIcon img;
    private int page, maxPage, index;
    private JPanel container, subjectPanel, buttonPanel;
    private JLabel header;
    
    public static void main(String[] args) {  
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);  
        Subject research = new Subject("Research", "research.png", 4, 1.75);
        Subject english = new Subject("English", "english.png", 2, 1.50);
        Subject socsci = new Subject("SocSci", "social science.png", 1, 1.50);  
        
        JFrame window = new Menu();
    }
    
    public Menu(){
        page = 0;
        maxPage = Subject.getListLength()/3;
        
        container = new JPanel();
        BoxLayout layout =  new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        this.add(container);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 240);
        
        header = new JLabel("Subjects");
        header.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 27));
        header.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(header);
        
        subjectPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        iconList = new ArrayList();
        for(int i=0; i<3; i++){
            JLabel icon = new JLabel();
            icon.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            iconList.add(icon);
            subjectPanel.add(icon);
        }
        
        container.add(subjectPanel);
        
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        prev = new JButton("Prev");
        next = new JButton("Next");
        buttonPanel.add(prev);
        buttonPanel.add(next);
        container.add(buttonPanel);
        
        for(JLabel j : iconList){
            j.addMouseListener(this);
        }
        prev.addActionListener(this);
        next.addActionListener(this);
        setSubjectIcons();
        this.setVisible(true);
    }
    
    public void setSubjectIcons(){
        index = page*3;
                
        for(int i=0; i<iconList.size(); i++){
            try{
                Subject s = Subject.getSubjectByIndex(index + i);
                img = new ImageIcon(Menu.class.getResource(s.getImgFileName()));
                iconList.get(i).setIcon(img);
            }
            catch(IndexOutOfBoundsException e){
                img = new ImageIcon(Menu.class.getResource("empty.png"));
                iconList.get(i).setIcon(img);
            }
        }
    }
    public void checkLimit(){
        if(page == maxPage) next.setEnabled(false);
        else next.setEnabled(true);
        if(page == 0) prev.setEnabled(false);
        else prev.setEnabled(true);
    }
    
    public void clearIcons(){
        for(JLabel i : iconList){
            i.setIcon(null);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
            clearIcons();
            page++;
            setSubjectIcons();
            checkLimit();
        }
        if(e.getSource() == prev){
            clearIcons();
            page--;
            setSubjectIcons();
            checkLimit();
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        this.dispose();
        
        int current = iconList.indexOf((JLabel) e.getSource());
        index = page*3;
        SubjectInstance.displayedSubject = Subject.getSubjectByIndex(index + current);
            
        new SubjectInstance();
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}