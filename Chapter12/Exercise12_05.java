import java.util.Scanner;
public class Exercise12_05{
  public static void main(String[] args){
    double side1;
    double side2;
    double side3;
    boolean filled;
    char fill;
    String color;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the 3 sides of the triangle.");
    System.out.print("Side 1: ");
    side1 = input.nextDouble();
    System.out.print("Side 2: ");
    side2 = input.nextDouble();
    System.out.print("Side 3: ");
    side3 = input.nextDouble();
    try{
      Triangle triangle1 = new Triangle(side1, side2, side3);
    }
    catch (IllegalTriangleException a){
      System.out.println(a);
    }
  }
}
