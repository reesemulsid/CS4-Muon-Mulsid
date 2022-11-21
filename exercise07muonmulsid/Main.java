package exercise07muonmulsid;
/*
You may remove the code from the previous exercise.
Create a Trainer, Monster, NPC, and Location.
Have the Trainer interact with each.
*/
public class Main {
    public static void main(String[] args) {
        Trainer lumine = new Trainer("Lumine");
        Monster wanderer = new WaterType("Wanderer", 100, 10);
        NPC dunyarzad = new NPC("Dunyarzad");
        Location sumeru = new Location("Sumeru", "Pita Wraps");
        
        System.out.println("New Trainer " + lumine.getName() + " has arrived!\n");
        
        lumine.inspect(wanderer);
        lumine.inspect(dunyarzad);
        lumine.inspect(sumeru);
    }
}