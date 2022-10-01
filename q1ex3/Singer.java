package q1ex3;

public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;

    public void performForAudience(int audience) {
        noOfPerformances += 1;
        earnings += audience * 100;
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
}