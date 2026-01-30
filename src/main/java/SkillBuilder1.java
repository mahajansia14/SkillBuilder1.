import java.util.Scanner;

/**
 * Skill Builder 1 - Input, Output, Variables, and Casting
 * CSCI-121
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Initial Greeting [cite: 20, 23]
        System.out.println("You're Jane's friend!");
        
        // 2. Name Prompt using Escape Characters for Double Quotes [cite: 21, 22, 23]
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();

        // 3. Floating-Point Input for 'spice' [cite: 26, 27, 31]
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        // 4. Calculate Mathematical Expression [cite: 33, 37, 43, 44, 45]
        // Formula: (4/3) * 2 raised to the power of (sqrt(5) / spice^3)
        double result = (4.0/3.0) * Math.pow(2, (Math.sqrt(5) / Math.pow(spice, 3)));

        // 5. Output Result formatted to 4 decimal places using printf [cite: 40, 42]
        System.out.printf("Well %s, the spice value resulted in %.4f\n", name, result);

        // 6. Converting to Nearest Hundredth using Type Casting (No printf) [cite: 46, 48, 53, 54, 55]
        // Trick: Multiply by 100, cast to int, then divide by 100.0
        double convertedValue = (int)(result * 100) / 100.0;
        System.out.println("And the converted value is " + convertedValue);
        
        // Call the second part of the assignment [cite: 56]
        calcWallPaint();
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        
        // Final double for paint coverage constant 
        final double SQUARE_FEET_PER_GALLON = 350.0;

        // 1. Input Wall Dimensions [cite: 57, 58, 60]
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // 2. Calculate and Output Wall Area [cite: 57, 62, 70]
        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + (int)wallArea + " square feet");

        // 3. Calculate Paint Needed in Gallons (Formatted to 2 decimals) [cite: 63, 65, 71]
        double paintNeeded = wallArea / SQUARE_FEET_PER_GALLON;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);

        // 4. Calculate Number of 1-Gallon Cans (Rounded up) [cite: 72, 73, 80]
        int cansNeeded = (int) Math.ceil(paintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
