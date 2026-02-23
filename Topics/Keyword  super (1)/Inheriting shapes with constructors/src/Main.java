import java.util.Scanner;

// Define the base class Shape
class Shape {
    // TODO: Add a constructor that takes the shape's name as a parameter
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // TODO: Add a getter method to retrieve the shape's name
    public String getName() {
        return name;
    }
}

// Define the derived class Rectangle
class Rectangle extends Shape {
    // TODO: Add a constructor that takes the shape's name, width, and height as parameters
    protected int width;
    protected int height;

    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    // TODO: Call the base class constructor using the super keyword
    public Rectangle(String name) {
        super(name);
    }
    // TODO: Add getter methods to retrieve the rectangle's width and height

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read the shape's name, width, and height from the user input
        String name = scanner.nextLine();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        // TODO: Create a Rectangle object using the user input
        Rectangle rectangle = new Rectangle(name, width, height);
        // TODO: Print out the rectangle's name, width, and height
        System.out.printf("Name: %s\nWidth: %d\nHeight: %d",
                rectangle.getName(), rectangle.getWidth(), rectangle.getHeight());

    }
}