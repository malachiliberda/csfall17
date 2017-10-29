public abstract class GeometricObject implements Comparable<GeometricObject>{
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  private double width = 1;
  private double height = 1;
  private double radius = 1;
  
  protected GeometricObject(){
    dateCreated = new java.util.Date();
  }
  protected GeometricObject(String color, boolean filled){
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }
  protected GeometricObject(double width, double height){
    this.width = width;
    this.height = height;
  }
  protected GeometricObject(double radius){
    this.radius = radius;
  }
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }
  public boolean isFilled(){
    return filled;
  }
  public void setFilled(boolean filled){
    this.filled = filled;
  }
  public java.util.Date getDateCreated(){
    return dateCreated;
  }
  public String toString(){
    return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
  }
  public abstract double getArea();
  
  public abstract double getPerimeter();
  @Override
  public int compareTo(GeometricObject a){
    if(this.getArea() > a.getArea()){
      return 1;
    }else if(this.getArea() < a.getArea()){
      return -1;
    }else{
      return 0;
    }
  }
  
  public static GeometricObject max(GeometricObject a, GeometricObject b){
    return a.compareTo(b) == 1 ? a : b;
  }
  
}
