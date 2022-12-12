package q2sa1muonmulsidambertherese;
/*
    Make GatheringQuest a subclass of Quest that has a difficulty of 1 (1pt)
    Remove redundancies with the superclass (5pts)
    Define checkAvailability() such that it returns true if currentGathered is less than quota and false otherwise (1pt)
    Define assigned() such that the adventurerCount is increased by 1 (1pt)
    Define abandoned() such that the adventurerCount is decreased by 1 (1pt)
    Define completed() such that the adventurerCount is decreased by 1 and the currentGathered is increased by 1 (1pt)
*/
public class GatheringQuest extends Quest implements Renewable{
    private String itemName;
    private int quota, currentGathered, adventurerCount;
    
    public GatheringQuest(String n, double r, String i, int q){
        super(n, 1, r);
        itemName = i;
        quota = q;
        currentGathered = 0;
        adventurerCount = 0;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    @Override
    public boolean checkAvailability() {
        if (currentGathered < quota){
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
        adventurerCount+=1;
        System.out.println("This quest has now been taken.");
    }
    
    @Override
    public void abandoned(){
        adventurerCount-=1;
        System.out.println("This quest is now available.");
    }
    
    @Override
    public void completed(){
        adventurerCount-=1;
        currentGathered+=1;
        System.out.println("This quest is now complete.");
    }
    
    @Override
    public void renew(){
        currentGathered = 0;
        System.out.println("This quest has started anew.");
    }
}
