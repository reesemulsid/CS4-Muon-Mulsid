package q2ex6;
/*
a Monster that has a type "fire", strong against "grass", weak against "water", 
and whose atk is 1.3 times the base value and def is 0.7 times the base value.
The special of FireTypes increase their atk by 2 points at the cost of reducing their HP by 10% of their maxHP.
the constructors of the subtypes will only require a name, HP value, and base value.
You will also need to override the special method so that it functions according to what was specified.
*/
public class FireType extends Monster{
    public FireType(String name, String type, int hp, int base){
        super(name, "fire", "grass", "water", hp, base);
        
        atk *= 1.3;
        def *= 0.7;
    }
    
    public void special(){
        atk += 2;
        
        
    }
}
