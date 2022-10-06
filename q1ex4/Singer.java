/*
    Get the classes from Exercise 03 and clean them up, implementing the conventions mentioned (access modifiers, getter/setter methods).
    Add a static field totalPerformances to the Singer class which counts all the performances of the Singers. Overload the 
    performForAudience method such that Singers can also perform with another Singer and the profit will be split between the two of them.
*/

package q1ex4;

public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;

    public void performForAudience(int audience) {
        noOfPerformances += 1;
        earnings += audience * 100;
    }

    public void performForAudience(String name1, String name2, int audience) {
        noOfPerformances += 1;
        earnings += audience * 100;
        double earnings1 = earnings/2;
        double earnings2 = earnings/2;
    }
    
    public void changeFavSong(Song newFavSong) {
        favoriteSong = newFavSong;
    }
    
    public Singer(String n, int num, double e, Song t) {
        name = n;
        noOfPerformances = num;
        earnings = e;
        favoriteSong = t;
    }
    
    public static int totalPerformances() {
        noOfPerformances += noOfPerformances;
        return noOfPerformances;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNoOfPerformances(){
        return noOfPerformances;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public Song getFavSong(){
        return favoriteSong;
    }
}
