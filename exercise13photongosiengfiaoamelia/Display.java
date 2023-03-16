package exercise13photongosiengfiaoamelia;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.*;

public class Display extends JFrame implements ActionListener, KeyListener{
	private JLabel header, warn;
	private JButton prev, next, searchButn;
	private JTextField search;
	private int index;
	private Subject displayedSubject;
	private DisplayGrade display;
	private JPanel headerPanel, subjectPanel, searchPanel, footerPanel;
	
	public Display(ArrayList<Subject> subjectList) {
		displayedSubject = Subject.subjectList.get(index);
		
		headerPanel = new JPanel(); //north panel
		header = new JLabel();
		headerPanel.add(header);
		header.setText(displayedSubject.getName() + " Grade");
		
		searchPanel = new JPanel(); //west panel for search bar
		searchPanel.setPreferredSize(new Dimension (195,195));
		search = new JTextField(10); //adding text field
		searchPanel.add(search);
		search.addKeyListener(this);
		searchButn = new JButton("Search"); //search button
		searchButn.addActionListener(this);
		searchPanel.add(searchButn);
		warn = new JLabel(""); //warning sign
		searchPanel.add(warn);
		
		subjectPanel = new JPanel(); //central panel for subject display
		display = new DisplayGrade(displayedSubject);
		subjectPanel.add(display);
		
		footerPanel = new JPanel(); //south panel
		prev = new JButton("Previous");
		footerPanel.add(prev);
		prev.addActionListener(this);
		next = new JButton("Next");
		footerPanel.add(next);
		next.addActionListener(this);
		
		this.setTitle("Your Grades"); //setting up jframe
		this.setSize(1000,750);
		this.setLayout(new BorderLayout(10, 10));
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(searchPanel, BorderLayout.WEST);
        this.add(subjectPanel, BorderLayout.CENTER);
        this.add(footerPanel, BorderLayout.SOUTH);
	}
	
	public void searchSub() {
		String sch = search.getText();
        try{
        	displayedSubject = Subject.searchSubject(sch);
        	warn.setText("");
        	header.setText(displayedSubject.getName() + " Grade");
			this.remove(display);
			display = new DisplayGrade(displayedSubject);
			this.add(display, BorderLayout.CENTER);
			header.setText(displayedSubject.getName() + " Grade");
        }
        catch(NullPointerException e){
            warn.setText("Subject does not exist");
        }
	}
	
	public void prevSub() {
		if(index==0) {
			header.setText("Invalid.");
		}
		else {
			index--;
			displayedSubject = Subject.subjectList.get(index);
			this.remove(display);
			display = new DisplayGrade(displayedSubject);
			this.add(display, BorderLayout.CENTER);
			header.setText(displayedSubject.getName() + " Grade");
		}
	}
	
	public void nextSub() throws IndexOutOfBoundsException{
		int max = Subject.getListLength()-1;
		try {
			if (index < max) {
				index++;
				displayedSubject = Subject.subjectList.get(index);
				this.remove(display);
				display = new DisplayGrade(displayedSubject);
				this.add(display, BorderLayout.CENTER);
				header.setText(displayedSubject.getName() + " Grade");
			}
			else {
				header.setText("Invalid.");
			}
		}
		catch(IndexOutOfBoundsException e) {}
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==prev) {
			prevSub();
		}
		else if(e.getSource()==next) {
			nextSub();
		}
		else if(e.getSource()==searchButn) {
			searchSub();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	public static void main(String[] args) {
		new Subject("Math", "math.png", 4, 1.75);
		new Subject("Biology", "biology.png", 3, 2.00);
		new Subject("Chemistry", "chemistry.png", 3, 1.50);
		new Subject("Physics", "physics.png", 3, 1.75);
		new Subject("CS", "computer science.png", 1, 1.50);
		
		Display subject = new Display(Subject.subjectList);
		subject.setVisible(true);
	}
}
