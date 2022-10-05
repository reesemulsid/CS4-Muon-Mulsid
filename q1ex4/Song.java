package q1ex4;

public class Song {
    private String title;
    private String singer;
    
    public Song() {
        title = "After Like";
        singer = "IVE";
    }
    
    public Song(String t, String s) {
        title = t;
        singer = s;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getSinger() {
        return singer;
    }
}