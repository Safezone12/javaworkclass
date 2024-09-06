public class App {
    public static void main(String[] args) throws Exception {
     Circle circle = new Circle("Red", 12);
     System.out.println("Color :"+circle.getColor());
     System.out.println("Radius: "+circle.getRadius());
     System.out.println("Area : "+circle.area());

     Rectrangle rectrangle = new Rectrangle("Green", 100, 15);
     System.out.println("Color :" +rectrangle.getColor());
     System.out.println("width  : "+rectrangle.getWidth());
     System.out.println("Height :"+rectrangle.getHeight());
     System.out.println("Area :"+rectrangle.area());
}
}
