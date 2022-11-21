package exercise07muonmulsid;
/*
a Monster that has a type "water", strong against "fire", weak against "grass",
and whose atk is 0.7 times the base value and def is 1.3 times the base value.
The special of WaterTypes increase their def by 2 points at the cost of reducing their HP by 10% of their maxHP.
the constructors of the subtypes will only require a name, HP value, and base value.
You will also need to override the special method so that it functions according to what was specified.
*/
public class WaterType extends Monster{
    public WaterType(String name, int hp, int base){
        super(name, "water", "fire", "grass", hp, base);
        
        atk *= 0.7;
        def *= 1.3;
    }
    
    @Override
    public void special(){
        def += 2;
        hp -= maxHP * 0.1;
        System.out.println(name + " used its special. Its atk is now " + atk + " while its health is " + hp + ".");
    }
}
