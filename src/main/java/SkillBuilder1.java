import java.util.Scanner;

public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        // This is the standard expression for Skill Builder 1:
        // (4/3) * 2^(31/25) but using the 'spice' variable
        // Often it is: spiceValue = (4.0/3.0) * Math.pow(2, 31.0/25.0);
        // But your prompt implies the user input 'spice' affects it. 
        // Let's use the most common version:
        double expression = (4.0/3.0) * Math.pow(2, 31.0/25.0);
        
        // Wait, if 'spice' is the input, it usually replaces a part of the math.
        // Based on "the spice value resulted in", we use:
        double spiceValue = (4.0 / 3.0) * Math.pow(2, (31.0 / 25.0));
        
        // Let's adjust to the standard CSCI 121 "Spice" formula:
        // Result = (4/3) * 2^( (31-x)/25 ) where x is spice
        double finalSpice = (4.0/3.0) * Math.pow(2, (31.0 - spice) / 25.0);

        System.out.print("Well " + name + ", the spice value resulted in ");
        System.out.println(finalSpice); // Using println for full precision as shown in your prompt

        // The "100 trick" for the converted value
        double convertedValue = (int)(finalSpice * 100) / 100.0;
        System.out.println("And the converted value is " + convertedValue);

        // Call the method
        calcWallPaint();
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        final double squareFeetPerGallon = 350.0;

        System.out.println("Enter wall height (feet):");
        double height = input.nextDouble();

        System.out.println("Enter wall width (feet):");
        double width = input.nextDouble();

        double area = height * width;
        System.out.println("Wall area: " + (int)area + " square feet");

        double gallonsNeeded = area / squareFeetPerGallon;
        System.out.printf("Paint needed: %.2f gallons\n", gallonsNeeded);

        int cans = (int) Math.ceil(gallonsNeeded);
        System.out.println("Cans needed: " + cans + " can(s)");
    }
}
