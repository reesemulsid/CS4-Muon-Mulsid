package exercise15muonmulsidamber;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Menu extends JFrame {
    private JPanel container, subjectPanel, buttonPanel;
    private MenuController controller;
    private JLabel header;
    private ArrayList<JLabel> iconList;
    private JButton prev, next, load;
    
    public Menu(){
        
        container = new JPanel();
        BoxLayout layout =  new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        this.add(container);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 240);
        
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
        
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        load = new JButton("Load CSV file");
        panel.add(load);
        container.add(panel);
        
        
        controller = new MenuController(this, iconList, prev, next, load);
        for(JLabel j : iconList){
            j.addMouseListener(controller);
        }
        prev.addActionListener(controller);
        next.addActionListener(controller);
        load.addActionListener(controller);
        controller.setSubjectIcons();
        
        this.setResizable(false);
        this.setVisible(true);
    }
}
