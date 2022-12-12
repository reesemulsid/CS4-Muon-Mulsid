package q2sa1muonmulsidambertherese;

public class Adventurer {
    private String name;
    protected Quest currentQuest;
    private int rank;
    protected double earnings;
    
    public Adventurer(String n, int r){
        name = n;
        rank = r;
        earnings = 0;
    }
    public String getName() {
        return name;
    }
    public int getRank() {
        return rank;
    }
    public double getEarnings() {
        return earnings;
    }
    
    public void takeQuest(Quest q){
        if(q.checkAvailability() && q.getDifficulty() <= rank){
            q.assigned();
            currentQuest = q;
            System.out.println("You have successfully taken this quest.");
        } else{
            System.out.println("You cannot take this quest.");
        }
    }
    public void abandonQuest(){
        if(currentQuest != null){
            currentQuest.abandoned();
            currentQuest = null;
            System.out.println("You have abandoned this quest.");
        }else{
            System.out.println("You currently do not have a quest to abandon.");
        }
    }
    public void completeQuest(){
        if(currentQuest != null){
            currentQuest.completed();
            earnings += currentQuest.getReward();
            currentQuest = null;
            System.out.println("You have completed this quest.");
        }else{
            System.out.println("You currently do not have a quest to complete.");
        }
    }
}
