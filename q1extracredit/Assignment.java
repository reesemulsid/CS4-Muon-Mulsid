package q1extracredit;

public class Assignment {
    private String name; //name - String
    private double timeAllotted;//timeAllotted - double
    
    public String getName(){ //getter method
        return name;
    }
    
    public double getTimeAllotted(){ //getter method
        return timeAllotted;
    }
    
    public void setName(String name){ //setter method
        this.name = name;
    }
    
    public void setTimeAllotted(double timeAllotted){ //setter method
        this.timeAllotted = timeAllotted;
    }
    
    public Assignment(String name, double timeAllotted) { //constructor
        this.name = name;
        this.timeAllotted = timeAllotted;
    }
}
