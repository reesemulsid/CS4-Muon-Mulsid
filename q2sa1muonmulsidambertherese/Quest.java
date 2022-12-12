package q2sa1muonmulsidambertherese;

/*
    Make Quest and abstract class (1pt)
    Make abstract method checkAvailability() which returns a boolean value (1pt)
    Make abstract method assigned() (1pt)
    Make abstract method abandoned() (1pt)
    Make abstract method completed() (1pt)
*/
public abstract class Quest {
    private String name;
    protected int difficulty;
    protected double reward;
    
    public Quest(String n, int d, double r){
        name = n;
        difficulty = d;
        if(difficulty < 1 ) difficulty = 1;
        if(difficulty > 10 ) difficulty = 10;
        reward = r;
    }
    
    public String getName() {
        return name;
    }
    public int getDifficulty() {
        return difficulty;
    }
    public double getReward() {
        return reward;
    }
    
    public abstract boolean checkAvailability();
    public abstract void assigned();
    public abstract void abandoned();
    public abstract void completed();
}
