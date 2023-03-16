/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingexer14;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Lauan 03
 */
public class MenuController implements MouseListener, ActionListener{
    private JFrame menu;
    private ArrayList<JLabel> iconList;
    private JButton prev, next;
    private int page, maxPage;
    
    public MenuController(JFrame m, ArrayList<JLabel> i, JButton p, JButton n){
        menu = m;
        page = 0;
        maxPage = Subject.getListLength()/3;
        iconList = i;
        prev = p;
        next = n;
    }
    
    public void setSubjectIcons(){
        int index = page*3;
        for(int i=0; i<iconList.size(); i++){
            try{
                Subject s = Subject.getSubjectByIndex(index + i);
                ImageIcon img = new ImageIcon(getClass().getResource("imgs/" + s.getImgFileName()));
                iconList.get(i).setIcon(img);
            }
            catch(IndexOutOfBoundsException e){
                ImageIcon img = new ImageIcon(getClass().getResource("imgs/empty.png"));
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
