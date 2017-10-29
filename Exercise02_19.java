import java.util.Scanner;

public class Exercise02_19{
  public static void main(String[] args){
    //Scanner "input" created.
    Scanner input = new Scanner(System.in);
    //Interaction between pc and user begins below.
    System.out.println("");
    System.out.println("Please be prepared to input the 3 points of the triangle.");
    System.out.println("As prompted, type in x1, y1, x2, y2, x3, and y3, in that order.");
    System.out.println("");
    System.out.println("First, x1");
    double x1 = input.nextDouble();
    System.out.println("Second, y1");
    double y1 = input.nextDouble();
    System.out.println("Now, x2");
    double x2 = input.nextDouble();
    System.out.println("Now, y2");
    double y2 = input.nextDouble();
    System.out.println("Now, x3");
    double x3 = input.nextDouble();
    System.out.println("Now, y3");
    double y3 = input.nextDouble();
    //End Interaction between pc and user.
    
    //Begin calculating distances of the sides on the triangle by using the points inputed by the user.
    //Distance between the first and second set of points is calculated.
    double z = 2;
    double a1 = (x2-x1);
    double a2 = (y2-y1);
    double a3 = Math.pow(a1, z); 
    double a4 = Math.pow(a2, z);
    double side1 = Math.sqrt((a3 + a4));
    //Distance between the second and third set of points is calculated.
    double b1 = (x3 - x2);
    double b2 = (y3 - y2);
    double b3 = Math.pow(b1, z);
    double b4 = Math.pow(b2, z);
    double side2 = Math.sqrt((b3 + b4));
    //Distance between the third and first set of points is calculated.
    double c1 = (x1 - x3);
    double c2 = (y1 - y3);
    double c3 = Math.pow(c1, z);
    double c4 = Math.pow(c2, z);
    double side3 = Math.sqrt((c3 + c4));
    //Distances are used to calculate the area of the triangle with the points given by the user.
    double side = ((side1 + side2 + side3) / z);
    double d1 = (side - side1);
    double d2 = (side - side2);
	double d3 = (side - side3);
    double a = (side * d1 * d2 * d3);
    double area = Math.sqrt(a);
	//The area is outputted.
    System.out.print("The area of the triangle is: ");
    System.out.println(area);
  }
}	