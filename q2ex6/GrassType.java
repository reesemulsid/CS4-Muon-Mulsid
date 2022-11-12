package q2ex6;
/*
The rest() of GrassTypes heal by half the maxHP.
The special of GrassTypes raise their health by 20% of the maxHP.
the constructors of the subtypes will only require a name, HP value, and base value.
You will also need to override the special method so that it functions according to what was specified.
*/
public class GrassType extends Monster{
    public GrassType(String name, int hp, int base){
        super(name, "grass", "water", "fire", hp, base);
    }
    
    @Override
    public void rest(){
        hp += maxHP * 0.5;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    
    @Override
    public void special(){
        hp += maxHP * 0.2;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " used its special. Its health is now " + hp + ".");
    }
}