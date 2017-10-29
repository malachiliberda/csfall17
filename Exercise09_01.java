public class Exercise09_01{
  public static void main(String[] args){
    //Create a Rectangle with width of 4 and height of 40
    Rectangle rectangle1 = new Rectangle(4, 40);
    System.out.println("RECTANGLE1");
    System.out.println("Width: " + rectangle1.getWidth());
    System.out.println("Height: " + rectangle1.getHeight());
    System.out.println("Area: " + rectangle1.getArea());
    System.out.println("Perimeter: " + rectangle1.getPerimeter());
    System.out.println();      
    //Create a Rectangle with width of 3.5 and height 35.9
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    System.out.println("------------------------------------");
    System.out.println();
    System.out.println("RECTANGLE2");
    System.out.println("Width: " + rectangle2.getWidth());
    System.out.println("Height: " + rectangle2.getHeight());
    System.out.println("Area: " + rectangle2.getArea());
    System.out.println("Perimeter: " + rectangle2.getPerimeter());
  }
}
class Rectangle{
  //Data fields width and height are assigned value of 1
  private double width = 1;
  private double height = 1;
  //Default Rectangle constructor
  public Rectangle(){
  }
  //Constructor that creates a rectangle with specified width and height
  public Rectangle(double w, double h){
    width = w;
    height = h;
  }
  //Method returns area of rectangle
  public double getArea(){
    return width * height;
  }
  //Method returns perimeter of rectangle
  public double getPerimeter(){
    return (width * 2) + (height * 2);
  }
  //Method returns width of rectangle
  public double getWidth(){
    return width;
  }
  //Method returns height of rectangle
  public double getHeight(){
    return height;
  }
}
