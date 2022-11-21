package exercise07muonmulsid;
/*
Considering that all Characters should be either a Trainer or an NPC,
convert the Character class into an abstract class
*/
public abstract class Character{
    private String name;
    private Location currentLocation;

    public Character(String n){
        this.name = n;
        this.currentLocation = null;
    }
    public Character(String n, Location l){
        this.name = n;
        this.currentLocation = l;
    }

    public String getName(){
        return name;
    }
    public Location getCurrentLocation(){
        return currentLocation;
    }
    public void travel(Location destination){
        currentLocation.removePerson(this);
        destination.addPerson(this);
        currentLocation = destination;
        System.out.println(this.getName() + " travelled to " + destination.getName() + ".");
    }
}
