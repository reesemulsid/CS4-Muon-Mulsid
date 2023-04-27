/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingexer15;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Lauan 03
 */
public class Display extends JFrame {
    private JPanel container, display, info, searchPanel, buttonPanel;
    private JLabel icon, name, units, grade;
    private JTextField searchTerm;
    private JButton search, prev, next, back;
    private Subject subject;
    
    
    public Display(Subject s){
        
        container = new JPanel();
        BoxLayout layout =  new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        this.add(container);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 290);
        
        display = new JPanel();
        GridLayout displayLayout =  new GridLayout(1,2);
        display.setLayout(displayLayout);
        container.add(display);
        
        icon = new JLabel();
        icon.setHorizontalAlignment(JLabel.CENTER);
        icon.setVerticalAlignment(JLabel.CENTER);
        display.add(icon);
        
        info = new JPanel(new GridLayout(3,2));
        display.add(info);
        
        JLabel label1 = new JLabel("Subject:");
        info.add(label1);
        
        name = new JLabel();
        info.add(name);
        
        JLabel label2 = new JLabel("Units:");
        info.add(label2);
        
        units = new JLabel();
        info.add(units);
        
        JLabel label3 = new JLabel("Grade:");
        info.add(label3);
        
        grade = new JLabel();
        info.add(grade);
        
        searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        searchTerm = new JTextField(14);
        searchPanel.add(searchTerm);
        search = new JButton("Search");
        searchPanel.add(search);
        container.add(searchPanel);
        
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        prev = new JButton("Previous");
        back = new JButton("Back");
        next = new JButton("Next");
        buttonPanel.add(prev);
        buttonPanel.add(next);
        buttonPanel.add(back);
        container.add(buttonPanel);
        
        setSubject(s);
        
        this.setResizable(false);
        this.setVisible(true);
    }
    
    public void setSubject(Subject s){
        subject = s;
        ImageIcon img = new ImageIcon(getClass().getResource("imgs/" + s.getImgFileName()));
        icon.setIcon(img);
        name.setText(s.getName());
        units.setText(Double.toString(s.getUnits()));
        grade.setText(Double.toString(s.getGrade()));
        disableButton();
    }
    public void disableButton(){
        int index = Subject.getSubjectIndex(subject);
        if(index == 0) prev.setEnabled(false);
        else prev.setEnabled(true);
        if(index == Subject.getListLength()-1) next.setEnabled(false);
        else next.setEnabled(true);
    }
    public void search(String term){
        try{
            Subject searched = Subject.searchSubject(term);
            setSubject(searched);
        }
        catch(NullPointerException err){

        }
    }
    
}
