package q1ex4;

public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances;

    public void performForAudience(int audience) {
        noOfPerformances += 1;
        totalPerformances += 1;
        earnings += audience * 100;
    }

    public void performForAudience(Singer n2, int audience) {
        noOfPerformances += 1;
        totalPerformances += 2;
        earnings += audience * 50;
        n2.earnings += audience * 50;
        n2.noOfPerformances += 1;
    }
    
    public void changeFavSong(Song newFavSong) {
        favoriteSong = newFavSong;
    }
    
    public void setSinger(String n, int num, double e, Song t) {
        name = n;
        noOfPerformances = num;
        earnings = e;
        favoriteSong = t;
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