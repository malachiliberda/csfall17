import java.util.Scanner;

public class Exercise13_05{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //Input from user is used to create Geometric Objects
    System.out.print("Please enter circle1's radius: ");
    double c1Radius = input.nextDouble();
    System.out.print("Please input circle2's radius: ");
    double c2Radius = input.nextDouble();
    System.out.print("Please input Rectangle1's width: ");
    double r1Width = input.nextDouble();
    System.out.print("Rectangle1's height: ");
    double r1Height = input.nextDouble();
    System.out.print("Please input Rectangle2's width: ");
    double r2Width = input.nextDouble();
    System.out.print("Rectangle2's height: ");
    double r2Height = input.nextDouble();
    
    GeometricObject circle1 = new Circle(c1Radius);
    GeometricObject circle2 = new Circle(c2Radius);
    GeometricObject rectangle1 = new Rectangle(r1Width, r1Height);
    GeometricObject rectangle2 = new Rectangle(r2Width, r2Height);
    
    System.out.print("The larger of the 2 circles is: ");
    if(Circle.max(circle1, circle2) == circle1){
      System.out.println("Circle 1");
    }else if(Circle.max(circle2, circle1) == circle2){
      System.out.println("Circle 2");
    }else{
      System.out.println("Neither. Both Circles are of equal size.");
    }
    
    System.out.print("Ther larger of the 2 rectangles is: ");
    if(Rectangle.max(rectangle1, rectangle2) == rectangle1){
      System.out.println("Rectangle 1");
    }else if(Rectangle.max(rectangle2, rectangle1) == rectangle2){
      System.out.println("Rectangle 2");
    }else{
      System.out.println("Neither. Both Rectangles are of equal size.");
    }
  }
}
