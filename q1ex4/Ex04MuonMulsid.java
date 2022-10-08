package q1ex4;

public class Ex04MuonMulsid {
    public static void main(String[] args) {
        
        Book top1 = new Book();
        top1.setBook("If We Were Villains", "English", "M.L. Rio");
        Book top2 = new Book();
        top2.setBook("The Invisible Life of Addie LaRue", "Spanish", "V.E. Schwab");
        Book top3 = new Book();
        top3.setBook("Every Day", "Filipino", "David Levithan");
        
        System.out.printf("#1 Favorite book%nTitle: %s%nLanguage: %s%nAuthor: %s%n%n", top1.getTitle(), top1.getLanguage(), top1.getAuthor());
        System.out.printf("#2 Favorite book%nTitle: %s%nLanguage: %s%nAuthor: %s%n%n", top2.getTitle(), top2.getLanguage(), top2.getAuthor());
        System.out.printf("#3 Favorite book%nTitle: %s%nLanguage: %s%nAuthor: %s%n%n", top3.getTitle(), top3.getLanguage(), top3.getAuthor());
        
        Song track1 = new Song();
        track1.setSong("FIRE BIRD", "Roselia");
        Song track2 = new Song();
        track2.setSong("Mabagal", "Moira Dela Torre and Daniel Padilla");
        
        System.out.printf("Currently playing: %s by %s%n", track1.getTitle(), track1.getSinger());
        System.out.printf("Next in queue: %s by %s%n%n", track2.getTitle(), track2.getSinger());
                
        Singer taylorSwift = new Singer();
        taylorSwift.setSinger("Taylor Swift", 0, 0, track1);        
        Singer Hozier = new Singer();
        Hozier.setSinger("Hozier", 0, 0, track1);
        
        taylorSwift.performForAudience(12);
        taylorSwift.changeFavSong(track2);
        
        System.out.println(taylorSwift.getName() + " is now performing " + track2.getTitle() + " by " + track2.getSinger() + "!");
        System.out.println("She has performed " + taylorSwift.getNoOfPerformances() + " song so far.");
        System.out.println("Her current earnings are " + taylorSwift.getEarnings() + ".");
        
        taylorSwift.performForAudience(Hozier, 20);
        
        System.out.println("\n" + taylorSwift.getName() + " is now performing " + track2.getTitle() + " by " + track2.getSinger() + "!");
        System.out.println("She has performed " + taylorSwift.getNoOfPerformances() + " song(s) so far.");
        System.out.println("Her current earnings are " + taylorSwift.getEarnings() + ".");
        
        System.out.println("\n" + Hozier.getName() + " is now performing " + track1.getTitle() + " by " + track1.getSinger() + "!");
        System.out.println("He has performed " + Hozier.getNoOfPerformances() + " song(s) so far.");
        System.out.println("His current earnings are " + Hozier.getEarnings() + ".");
    }
}