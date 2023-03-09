package exercise13photongosiengfiaoamelia;
import java.awt.FlowLayout;
import javax.swing.*;

public class DisplayGrade extends JPanel{
	private JLabel subjectName, info;
	private ImageIcon img;
	
	public DisplayGrade(Subject s) {
		subjectName = new JLabel(s.getName());
		img = new ImageIcon(Display.class.getResource(s.getImgFileName()));
		info = new JLabel("Grade: " + s.getGrade() + "       Units: " + s.getUnits());
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		this.add(subjectName);
		subjectName.setIcon(img);
		subjectName.setLayout(new FlowLayout(FlowLayout.CENTER));
		subjectName.setVerticalTextPosition(JLabel.BOTTOM);
		this.add(info);
		info.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
	}
}
