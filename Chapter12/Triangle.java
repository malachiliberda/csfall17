public class Triangle extends GeometricObject{
  private double side1 = 1.0;
  private double side2 = 1.0;
  private double side3 = 1.0;
  
  public Triangle(){
  }
  public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
    if(side1 > side2 + side3){
      throw new IllegalTriangleException("Error: side1 is greater than side2 + side3");
    }else if(side2 > side1 + side3){
      throw new IllegalTriangleException("Error: side2 is greater than side1 + side3");
    }else if(side3 > side1 + side2){
      throw new IllegalTriangleException("Error: side3 is greater than side1 + side2");
    }else{
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }  
  }
  public double getArea(){
    double s = (side1 + side2 + side3)/2;
    double area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
    return area;
  }
  public double getPerimeter(){
    double perimeter = side1 + side2 + side3;
    return perimeter;
  }
  public String toString(){
    return "Triangle: side 1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }
}

