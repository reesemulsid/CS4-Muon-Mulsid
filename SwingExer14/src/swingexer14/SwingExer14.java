/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingexer14;

/**
 *
 * @author Lauan 03
 */
public class SwingExer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Subject("Math", "math.png", 4, 1.75);
        new Subject("Biology", "biology.png", 3, 2.0);
        new Subject("Chemistry", "chemistry.png", 3, 1.5);
        new Subject("Physics", "physics.png", 3, 1.75);
        new Subject("Computer Science", "computer science.png", 1, 1.5);
        new Subject("Social Science", "social science.png", 1, 1.5);
        new Subject("English", "english.png", 1, 1.75);
        new Subject("Research", "research.png", 5, 1.5);
        
        new Menu();
    }
    
}
