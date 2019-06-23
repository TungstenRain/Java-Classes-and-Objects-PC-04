package ch08pc04;
import java.util.Scanner;

/**
 * LandTract Class
 * Compare the size of two tracts of land
 */
public class Ch08pc04 {

    public static void main(String[] args) {
        // Variables
        double length, width;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request information from user
        System.out.print("Please enter the length for tract 1: ");
        length = keyboard.nextDouble();
        System.out.print("Please enter the width for tract 1: ");
        width = keyboard.nextDouble();
        
        // instantiate LandTract class
        LandTract tract1 = new LandTract(length, width);
        
        // Request input from user
        System.out.print("Please enter the length for tract 2: ");
        length = keyboard.nextDouble();
        System.out.print("Please enter the width for tract 2: ");
        width = keyboard.nextDouble();
        
        // Instantiate second LandTract class
        LandTract tract2 = new LandTract(length, width);
        
        // Display results
        System.out.printf("The area for tract 1 is: %,.2f.  The area for tract 2 is: %,.2f.\n", tract1.getArea(), tract2.getArea());
        
        if (tract1.equals(tract2))
            System.out.println("Tract 1 an Tract 2 are the same size.");
        else
            System.out.println("Tract 1 and Tract 2 are not the same size.");
    }
    
}
