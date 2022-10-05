package q1ex4;

public class Book {
    private String title;
    private String language;
    private String author;
    
    public Book(String t, String l, String a) {
        title = t;
        language = l;
        author = a;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String getAuthor() {
        return author;
    }
}