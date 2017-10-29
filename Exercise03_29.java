import java.util.Scanner;

public class Exercise03_29{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Scanner takes users input on circle info.
    System.out.print("Please input circle1's center x coordinate: ");
    double c1x = input.nextDouble();
    System.out.print("Please input circle1's center y coordinate: ");
    double c1y = input.nextDouble();
    System.out.print("Please input circle1's radius: ");
    double c1r = input.nextDouble();
    System.out.print("Please input circle2's center x coordinate: ");
    double c2x = input.nextDouble();
    System.out.print("Please input circle2's center y coordinate: ");
    double c2y = input.nextDouble();
    System.out.print("Please input circle2's radius: ");
    double c2r = input.nextDouble();
    //Mathematical process for finding the distances between the centers is started.
    double distance = (Math.sqrt(Math.pow((c2x-c1x), 2) + (Math.pow((c2y - c2x), 2))));
    //Program checks whether the second circle over laps with the first or if it is inside the first. 
    if (distance <= (c1r - c2r)){
      System.out.println("Cirlce 2 is inside Circle 1.");
    }else if (distance <= (c1r + c2r)){
      System.out.println("Cirlce 2 overlaps with Circle 1.");
    }else{
      System.out.println("Circle 2 is outide Circle 1, and therefore does not overlap with it.");
    }
  }
}