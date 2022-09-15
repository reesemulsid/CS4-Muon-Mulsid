package q1ex2;

import java.util.Scanner;

public class Ex02MuonMulsid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice;
    int lower = 1, upper = 10, guess = 3;
    
    do{
        System.out.println("Welcome to Higher or Lower! What will you do? \n-Start game \n-Change settings \n-End application");
        choice = sc.nextLine();
    
        if (choice.equalsIgnoreCase("Start game")) {
            String repeat;
            do{
                System.out.println("\nYou have chosen to start the game.");
                int random = (int) Math.floor(Math.random() * (upper - lower)) + lower;
                int remaining;

                for (remaining = guess; remaining > 0; remaining--) {
                    System.out.print("You have " + remaining + " guess(es) left. What is your guess? ");
                    int number = Integer.parseInt(sc.nextLine());
                    if (number > random && remaining > 1) {
                        System.out.print("Guess lower! ");
                    } else if (number < random && remaining > 1) {
                        System.out.print("Guess higher! ");
                    } else if (number == random) {
                        System.out.println("You got it!");
                        break;
                    }
                }
                
                if (remaining == 0) {
                    System.out.println("You lost... ");
                }
                
                System.out.print("Play again (y/n)? ");
                repeat = sc.nextLine();
            } while("y".equals(repeat));       
            
        break;
        } else if (choice.equalsIgnoreCase("Change settings")) {
            System.out.println("\nWhat is the lower limit of the random number?");
            lower = Integer.parseInt(sc.nextLine());
            
            System.out.println("What is the upper limit of the random number?");
            upper = Integer.parseInt(sc.nextLine());
            
            System.out.println("How many guesses are allowed?");
            guess = Integer.parseInt(sc.nextLine());
        
            System.out.println("Lower limit: " + lower);
            System.out.println("Upper limit: " + upper);
            System.out.println("Guesses: " + guess + "\n");
        } else if (choice.equalsIgnoreCase("End application")) { 
            System.out.println("\nThank you for playing!");
            break;
        } else {
            System.out.println("\nInvalid input!");
            break;
        }
    } while (!choice.equalsIgnoreCase("End application"));
  }
}