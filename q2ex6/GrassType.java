package q2ex6;
/*
a Monster that has a type "grass", strong against "water", weak against "fire",
and whose atk and def is equal to the base value. The rest() of GrassTypes heal by half the maxHP.
The special of GrassTypes raise their health by 20% of the maxHP.
the constructors of the subtypes will only require a name, HP value, and base value.
You will also need to override the special method so that it functions according to what was specified.
*/
public class GrassType extends Monster{
    public GrassType(String name, String type, int hp, int base){
        super(name, "grass", "water", "fire", hp, base);
    }
    
    public void rest(){
        
    }
    
    public void special(){
        
    }
}
