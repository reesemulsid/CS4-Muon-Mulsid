package q2sa1muonmulsidambertherese;
/*
    Make Novice a subclass of Adventurer that has a rank of 1 (1pt)
    Remove redundancies with the superclass (5pts)
    Override takeQuest such that if the Novice has taken 10 quests already, he cannot take new quests (2pts)
*/
public class Novice extends Adventurer implements Renewable{
    private int questCount;
    
    public Novice(String n){
        super(n, 1);
        questCount = 0;
    }
    
    @Override
    public void takeQuest(Quest q){
        if(questCount == 10){
            System.out.println("You cannot take a new quest at this moment.");
        }
        else{
            q.assigned();
            currentQuest = q;
            System.out.println("You have successfully taken this quest.");
        }
    }
    
    @Override
    public void renew(){
        questCount = 0;
        earnings-=30;
        System.out.println("You have started anew.");
    }
}
