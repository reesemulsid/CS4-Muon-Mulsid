package exercise13photongosiengfiaoamelia;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.GridLayout;

public class DisplayAllGrades extends JFrame{
	private JPanel headingPanel, mainPanel, footerPanel;
	private JLabel header;
	private JButton next;
	int row = 5, col = 1;
	
	public DisplayAllGrades(Subject[] subList) {
		header = new JLabel("Here are your grades and subject info:");
		next = new JButton("Next!");
		
		headingPanel = new JPanel();
		headingPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		headingPanel.add(header);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(row, col));
		for (Subject s : subList) {
			DisplayGrade display = new DisplayGrade(s);
			mainPanel.add(display);
		}
		
		footerPanel = new JPanel();
		footerPanel.add(next);
		
		this.setTitle("Your Grades");
		this.setSize(1000,750);
		this.setLayout(new BorderLayout(10,10));
		this.add(headingPanel, BorderLayout.NORTH);
		this.add(mainPanel, BorderLayout.CENTER);
		this.add(footerPanel, BorderLayout.SOUTH);
	}
}
