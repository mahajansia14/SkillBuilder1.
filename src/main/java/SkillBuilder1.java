import java.util.Scanner;

public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        // Calculate the expression: (4/3) * 2^(sqrt(5)/spice^3)
        double result = (4.0/3.0) * Math.pow(2, (Math.sqrt(5) / Math.pow(spice, 3)));

        System.out.printf("Well %s, the spice value resulted in %.4f\n", name, result);

        // The Casting Trick: Multiply by 100, cast to int, divide by 100.0
        double convertedValue = (int)(result * 100) / 100.0;
        System.out.println("And the converted value is " + convertedValue);
        
        // DO NOT call calcWallPaint() here if the autograder tests main separately.
        // If your teacher's instructions say to run both at once, uncomment the line below:
        // calcWallPaint(); 
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        final double squareFeetPerGallon = 350.0;

        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        double paintNeeded = wallArea / squareFeetPerGallon;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);

        int cansNeeded = (int) Math.ceil(paintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
