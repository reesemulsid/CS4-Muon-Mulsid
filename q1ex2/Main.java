package q1ex2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String choice;
    int lower = 1, upper = 10, guess = 3;
    
    System.out.println("Welcome to Higher or Lower! What will you do?");
    System.out.println("-Start game");
    System.out.println("-Change settings");
    System.out.println("-End application");
    choice = sc.nextLine();
    
    
    if (choice.equalsIgnoreCase("Start game")) {
      System.out.println("You have chosen to start the game.");
    } else if (choice.equalsIgnoreCase("Change settings")) {
        System.out.println("What is the lower limit of the random number?");
        lower = sc.nextInt();
        System.out.println("What is the upper limit of the random number?");
        upper = sc.nextInt();
        System.out.println("How many guesses are allowed?");
        guess = sc.nextInt();
        
        System.out.println("Lower limit: " + lower);
        System.out.println("Upper limit: " + upper);
        System.out.println("Guesses: " + guess);
    } else if (choice.equalsIgnoreCase("End application")) {
        System.out.println("Thank you for playing!");
    } else {
        System.out.println("Invalid input!");
    }
  }
}