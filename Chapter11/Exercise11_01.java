import java.util.Scanner;
public class Exercise11_01{
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
    System.out.print("Is the triangle filled? (yes/no): ");
    fill = input.next().charAt(0);
    if(fill == 'y'){
      filled = true;
    }else{
      filled = false;
    }
    System.out.print("Please enter a color for the triangle: ");
    color = input.next();
    
    Triangle triangle1 = new Triangle(side1, side2, side3);
    GeometricObject triangle2 = new GeometricObject(color, filled);
    System.out.println("The triangle's area is: " + triangle1.getArea());
    System.out.println("The triangle's perimeter is: " + triangle1.getPerimeter());
    System.out.println(triangle2.toString());
   
  }
}
