import java.util.Scanner;

/**
 * Triangle class that stores a triangle's name, base, and height
 * and can calculate and display its area.
 *
 * @author Raina Shapur
 * @version v1.0
 * @since October 11, 2026
 */
public class Triangle {

    private String name;
    /** The base of the triangle. */
    private double base;
    /** The height of the triangle. */
    private double height;

    /**                                                                    
     * Creates a Triangle with the name "Unknown" and a base and height of 0.0.
     */
    public Triangle() {
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }

    /**
     * Creates a Triangle with the name, base, and height.        
     *
     * @param inName   the name of the triangle
     * @param inBase   the base of the triangle
     * @param inHeight the height of the triangle
     */
    public Triangle(String inName, double inBase, double inHeight) {
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**                                                                   
     * Displays the triangle's name, base, height, and area (rounded to one
     * decimal place) to the console.
     */
    public void writeOutput() {
        System.out.println("Triangle name is: " + name);
        System.out.printf("Triangle base is: %.1f%n", base);
        System.out.printf("Triangle height is: %.1f%n", height);
        System.out.printf("Triangle area is: %.1f%n", getArea());
    }

    /**                                                                   
     * Asks the user for the triangle's name, base, and height, and stores
     * the values entered.
     */
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();
        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();
        System.out.print("What is the triangle's height: ");
        height = keyboard.nextDouble();
    }

    /**
     * Gets the name of the triangle.
     *
     * @return the triangle's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the base of the triangle.
     *
     * @return the triangle's base
     */
    public double getBase() {
        return base;
    }

    /**
     * Gets the height of the triangle.
     *
     * @return the triangle's height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the name of the triangle.
     *
     * @param newName the new name for the triangle
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Sets the base of the triangle.
     *
     * @param newBase the new base for the triangle
     */
    public void setBase(double newBase) {
        base = newBase;
    }

    /**
     * Sets the height of the triangle.
     *
     * @param newHeight the new height for the triangle
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    /**
     * Calculates the area of the triangle using (base * height) / 2.
     *
     * @return the area of the triangle
     */
    private double getArea() {
        return (base * height) / 2.0;
    }
}