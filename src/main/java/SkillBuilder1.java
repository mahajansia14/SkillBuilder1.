import java.util.Scanner;

public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part 1: Printing and Input
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        // Mathematical Expression: (4/3) * 2^(sqrt(5)/spice^3)
        double result = (4.0/3.0) * Math.pow(2, (Math.sqrt(5) / Math.pow(spice, 3)));

        // Output with 4 decimal places
        System.out.printf("Well %s, the spice value resulted in %.4f\n", name, result);

        // The Casting Trick: Multiply by 100, cast to int, then divide by 100.0
        // The assignment forbids using printf for this line 
        double convertedValue = (int)(result * 100) / 100.0;
        System.out.println("And the converted value is " + convertedValue);
        
        // Call the next method to complete the program execution
        calcWallPaint();
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        final double squareFeetPerGallon = 350.0; // Required final double [cite: 64]

        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // Calculate and output area
        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate gallons and format to 2 decimal places using printf [cite: 65]
        double paintNeeded = wallArea / squareFeetPerGallon;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);

        // Use Math.ceil to round up to the nearest whole gallon [cite: 73]
        int cansNeeded = (int) Math.ceil(paintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
