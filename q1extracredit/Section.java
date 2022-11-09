package q1extracredit;
import java.util.*;

public class Section {
    private String name; //name - String
    private static ArrayList<Student> students = new ArrayList(); //students - ArrayList<Student>
    
    public String getName() { //getter method
        return name;
    }
    
    public void setName(String name) { //setter method
        this.name = name;
    }
    
    public Section(String name) { //constructor
        this.name = name;
    }
    
    public void addStudent(Student s){ //addStudent(Student s) - adds a Student to the section
        students.add(s);
    }
    
    public Student getSectionStudent(int n) {
        return students.get(n);
    }
    
    public int getSectionSize() {
        return students.size();
    }
}
