package exercise09muonmulsid;
/*
NPC interact: prints the dialog
*/
public class NPC extends Character implements Interactive {
    private String dialog;

    public NPC(String n){
        super(n);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, Location l){
        super(n, l);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, String d){
        super(n);
        this.dialog = d;
    }
    public NPC(String n, Location l, String d){
        super(n, l);
        this.dialog = d;
    }
    
    public void interact(){
        System.out.println(dialog);
    }
}