import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfContainers = input.nextInt();
        int container = 0;
        ArrayList<Shape> shapesList = new ArrayList<>();
        for (int i = 0; i < numberOfContainers; i++) {
            System.out.println("Cylinder 1 , Cuboid 2 ");
            int userInput = input.nextInt();
            Shape shape = makeShape(userInput);
            shapesList.add(shape);
        }
        try {
            Collections.sort(shapesList);
            for (Shape shape :
                    shapesList) {

                System.out.println("Container : " + ++container + " " + shape.toString());

            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }


    public static Shape makeShape(int number) {
        int height, amount;
        switch (number) {
            case 1 -> {
                int radius;
                try {
                    System.out.print("Radius : ");
                    radius = input.nextInt();
                    System.out.print("Height : ");
                    height = input.nextInt();
                    Cylinder cylinder = new Cylinder(height, radius);
                    amount = input.nextInt();
                    cylinder.setRemainingAmount(amount);
                    System.out.println("x");
                    return cylinder;
                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
            case 2 -> {
                int length, width;
                try {
                    System.out.print("Length : ");
                    length = input.nextInt();
                    System.out.print("Width : ");
                    width = input.nextInt();
                    System.out.print("Height : ");
                    height = input.nextInt();
                    System.out.println("Remaining Amount : ");
                    Cuboid cuboid = new Cuboid(length, width, height);
                    System.out.print("Enter filled amount in cubic meters : ");
                    amount = input.nextInt();
                    cuboid.setRemainingAmount(amount);
                    if (isValidShape(cuboid))
                        return cuboid;
                } catch (Exception exception) {
                    System.out.println(exception
                    );
                }
            }
        }
        return null;
    }

    public static boolean isValidShape(Shape shape) {
        if (shape.getVolume() <= 0) {
            System.out.println("Invalid parameters , Shape dimensions should be greater than 0");
            return false;
        } else if (shape.getRemainingAmount() < 0) {
            System.out.println("No remaining space");
            return false;
        }
        return true;
    }

}