package q1extracredit;
import java.util.*;

public class Student {
    private String name; //name - String
    private static ArrayList<Assignment> assignments = new ArrayList(); //assignments - ArrayList<Assignment>
    
    public String getName() { //getter method
        return name;
    }
    
    public Student(String name) { //constructor
        this.name = name;
    }
    
    public void setName(String name) { //setter method
        this.name = name;
    }
    
    private int index;
    
    public void finishAssignment(Assignment a){ //removes the specified assignment from the student
        a = assignments.get(index);
        assignments.remove(index);
    }
    
    public double getTimeNeeded() { //getTimeNeeded() - returns total timeAllotted of all the Assignments of the student
        double totalTimeAllotted = 0;
        for (int i = 0; i < assignments.size(); i++) {
            totalTimeAllotted =+ assignments.get(i).getTimeAllotted();
        }
        return totalTimeAllotted;
    }
}
