package q1ex3;

public class Ex03MuonMulsid {
    public static void main(String[] args) {
        
        Book top1 = new Book("If We Were Villains", "English", "M.L. Rio");
        Book top2 = new Book("The Invisible Life of Addie LaRue", "Spanish", "V.E. Schwab");
        Book top3 = new Book("Every Day", "Filipino", "David Levithan");
        
        System.out.printf("#1 Favorite book%nTitle: %s%nLanguage: %s%nAuthor: %s%n%n",
                top1.title, top1.language, top1.author);
        System.out.printf("#2 Favorite book%nTitle: %s%nLanguage: %s%nAuthor: %s%n%n",
                top2.title, top2.language, top2.author);
        System.out.printf("#3 Favorite book%nTitle: %s%nLanguage: %s%nAuthor: %s%n%n",
                top3.title, top3.language, top3.author);
        
        Song track1 = new Song("FIRE BIRD", "Roselia");
        Song track2 = new Song("Mabagal", "Moira Dela Torre and Daniel Padilla");
        
        System.out.printf("Currently playing: %s by %s%n", track1.title, track1.singer);
        System.out.printf("Next in queue: %s by %s%n%n", track2.title, track2.singer);
                
        Singer taylorSwift = new Singer("Taylor Swift", 0, 0, track1);
        
        taylorSwift.performForAudience(12);
        taylorSwift.changeFavSong(track2);
        
        System.out.println(taylorSwift.name + " is now performing " + track2.title + " by " + track2.singer + "!");
        System.out.println("She has performed " + taylorSwift.noOfPerformances + " song so far.");
        System.out.println("Her current earnings are " + taylorSwift.earnings + ".");
    }
}