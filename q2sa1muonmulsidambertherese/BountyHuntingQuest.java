package q2sa1muonmulsidambertherese;
/*
    Make BountyHuntingQuest a subclass of Quest (1pt)
    Remove redundancies with the superclass (5pt)
    Define checkAvailability() such that it checks if the quest is both available and not complete (1pt)
    Define assigned() such that the value of availability is set to false (1pt)
    Define abandoned() such that the value of availability is set to true (1pt)
    Define completed() such that the value of completed is set to true (1pt)
*/
public class BountyHuntingQuest extends Quest{
    private String target;
    private boolean available, completed;
    
    public BountyHuntingQuest(String n, int d, double r){
        super(n, d, r);
        if(difficulty < 1 ) difficulty = 5;
        if(difficulty > 10 ) difficulty = 10;
        available = true;
    }
    
    public String getTarget(){
        return target;
    }
    
    @Override
    public boolean checkAvailability() {
        if (available && !completed){
            System.out.println("This quest is available.");
            return true;
        }
        else {
            System.out.println("This quest is not available.");
            return false;
        }
    }
    
    @Override
    public void assigned(){
        available = false;
        System.out.println("This quest has now been taken.");
    }
    
    @Override
    public void abandoned(){
        available = true;
        System.out.println("This quest is now available.");
    }
    
    @Override
    public void completed(){
        completed = true;
        System.out.println("This quest is now complete.");
    }
    
}
