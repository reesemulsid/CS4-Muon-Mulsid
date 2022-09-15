package q1ex2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice;
    
    do{
        int lower = 1, upper = 10, guess = 3;
    
        System.out.println("Welcome to Higher or Lower! What will you do? \n-Start game \n-Change settings \n-End application");
        choice = sc.nextLine();
    
        if (choice.equalsIgnoreCase("Start game")) {
            String repeat;
            do{
                System.out.println("You have chosen to start the game.");
                int random = (int) Math.floor(Math.random()*10) + 1;


                for (int remaining = guess; remaining > 0; remaining--) {
                    System.out.print("You have " + remaining + " guess(es) left. What is your guess? ");
                    int number = Integer.parseInt(sc.nextLine());
                    if (number > random) {
                        System.out.println("Guess lower! You have " + guess + " guess(es) left. What is your guess? ");
                        continue;
                    } else if (number < random) {
                        System.out.println("Guess higher! You have " + guess + " guess(es) left. What is your guess? ");
                        continue;
                    } else {
                        System.out.println("You got it!");
                        break;
                    }
                }

                System.out.print("Play again (y/n)?");
                repeat = sc.nextLine();
            } while("y".equals(repeat));                
            
        } else if (choice.equalsIgnoreCase("Change settings")) {
            System.out.println("What is the lower limit of the random number?");
            lower = Integer.parseInt(sc.nextLine());
            System.out.println("What is the upper limit of the random number?");
            upper = Integer.parseInt(sc.nextLine());
            System.out.println("How many guesses are allowed?");
            guess = Integer.parseInt(sc.nextLine());
        
            System.out.println("Lower limit: " + lower);
            System.out.println("Upper limit: " + upper);
            System.out.println("Guesses: " + guess + "\n");
        } else if (choice.equalsIgnoreCase("End application")) { 
            System.out.println("Thank you for playing!");
            break;
        } else {
            System.out.println("Invalid input!");
            break;
        }
    } while (!choice.equalsIgnoreCase("End application"));
  }
}