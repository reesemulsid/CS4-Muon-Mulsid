package q2ex6;
/*
create three Monsters, one of each type (you may choose the values for the Monsters).
Simulate 3 separate battles, Grass vs Fire, Fire vs Water, and Water vs Grass.
Create a loop so that they repeatedly attack each other until one or both HP is reduced to 0.
*/
public class Ex06MuonMulsid {
    public static void main(String[] args) {
        Monster xiangling = new FireType("Xiangling", 115, 8);
        Monster nahida = new GrassType("Nahida", 100, 10);
        Monster yelan = new WaterType("Yelan", 90, 9);
        
        System.out.println("New Fire Type " + xiangling.getName() + " has joined the battle!");
        System.out.println("New Grass Type " + nahida.getName() + " has joined the battle!");
        System.out.println("New Water Type " + yelan.getName() + " has joined the battle!\n");
        
        System.out.println("Starting Battle 1: Grass vs Fire");
        
        do{
            nahida.attack(xiangling);
            if (xiangling.getHP() == 0){
                System.out.println("The battle has ended. The winner is " + nahida.getName() + "!\n");
                break;
            }
            
            xiangling.attack(nahida);
            if (nahida.getHP() == 0) {
                System.out.println("The battle has ended. The winner is " + xiangling.getName() + "!\n");
                break;
            }
        } while(true);
        
        nahida.hp = nahida.getMaxHP();
        xiangling.hp = xiangling.getMaxHP();
        
        System.out.println("Starting Battle 2: Fire vs Water");
        
        do{
            xiangling.attack(yelan);
            if (yelan.getHP() == 0) {
                System.out.println("The battle has ended. The winner is " + xiangling.getName() + "!\n");
                break;
            }
            
            yelan.attack(xiangling);
            if (xiangling.getHP() == 0){
                System.out.println("The battle has ended. The winner is " + yelan.getName() + "!\n");
                break;
            }
        } while(true);
        
        xiangling.hp = xiangling.getMaxHP();
        yelan.hp = yelan.getMaxHP();
        
        System.out.println("Starting Battle 3: Water vs Grass");
        
        do{
            yelan.attack(nahida);
            if (nahida.getHP() == 0){
                System.out.println("The battle has ended. The winner is " + yelan.getName() + "!\n");
                break;
            }
            
            nahida.attack(yelan);
            if (yelan.getHP() == 0) {
                System.out.println("The battle has ended. The winner is " + nahida.getName() + "!\n");
                break;
            }
        } while(true);
        
        yelan.hp = yelan.getMaxHP();
        nahida.hp = nahida.getMaxHP();
    }
}