package exercise09muonmulsid;
/*
Add a method inspect(Interactive i) to the Trainer class
The inspect method simply calls the interact method of the Interactive object
*/
import java.util.*;

public class Trainer extends Character {
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        super(n);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }
    public Trainer(String n, Location l){
        super(n, l);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    
    public void inspect(Interactive i){
        i.interact();
    }
    public void sureCapture(Monster m) throws AlreadyCapturedException, FullTeamException{
        /*
        throws AlreadyCapturedException if the selected Monster is already in the Trainer's team. (Try using .contains())
        throws FullTeamException if the Trainer already has 6 Monsters.
        */
        if(team.contains(m) == false){
            team.add(m);
            System.out.printf("%s was successfully captured.%n", m.getName());
        }
        else{
            throw new AlreadyCapturedException("Monster is already in the Trainer's team.");
        }
        if(team.size() == 7){
            throw new FullTeamException("Trainer already has 6 Monsters.");
        }
    }
    public void release(Monster m) throws NotInTeamException{
        //throws NotInTeamException if the selected Monster is not in the Trainer's team.
	team.remove(m);
	System.out.printf("%s was released from the team.%n", m.getName());
        if(!team.contains(m)){
            throw new NotInTeamException("Monster is not in the Trainer's team.");
        }
    }
}
