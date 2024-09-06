public class Rectrangle extends Shape {
 private double width;
 private double height;
public Rectrangle(String color, double width, double height) {
    super(color);
    this.width = width;
    this.height = height;
}
@Override
public double area() {
    // TODO Auto-generated method stub
    return height *width;
}
public double getWidth() {
    return width;
}
public void setWidth(double width) {
    this.width = width;
}
public double getHeight() {
    return height;
}
public void setHeight(double height) {
    this.height = height;
}
 
}
