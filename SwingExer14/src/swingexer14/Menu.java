/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingexer14;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Lauan 03
 */
public class Menu extends JFrame {
    private JPanel container, subjectPanel, buttonPanel;
    private MenuController controller;
    private JLabel header;
    private ArrayList<JLabel> iconList;
    private JButton prev, next;
    private int page, maxPage;
    
    
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
        
        
        controller = new MenuController(this, iconList, prev, next);
        for(JLabel j : iconList){
            j.addMouseListener(controller);
        }
        prev.addActionListener(controller);
        next.addActionListener(controller);
        controller.setSubjectIcons();
        
        this.setResizable(false);
        this.setVisible(true);
    }
}
