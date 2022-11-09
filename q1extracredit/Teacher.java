package q1extracredit;
import java.util.*;

public class Teacher {
    private String name, subject; //name - String, subject - String
    private static ArrayList<Section> sections = new ArrayList(); //sections - ArrayList<Section> or Section[]
    
    public String getName() { //getter method
        return name;
    }
    
    public String getSubject() { //getter method
        return subject;
    }
    
    public void setName(String name) { //setter method
        this.name = name;
    }
    
    public void setSubject(String subject) { //setter method
        this.subject = subject;
    }
    
    public Teacher(String name, String subject) { //constructor
        this.name = name;
        this.subject = subject;
    }
    
    public void giveAssignment(Assignment a){ //giveAssignment(Assignment a) - adds the Assignment to each Student in all the sections he/she handles
        int counter = 0;
        
        for (Section s : sections){
            if (s.getName().equalsIgnoreCase(subject)){
                counter++;
            }
        }
    }
}
