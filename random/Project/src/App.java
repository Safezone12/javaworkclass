import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random objRandom = new Random();
        int ans = objRandom.nextInt(); 
        
       
        Student student = new Student("safe", "bio", "20");
        student.displayInfo();
        student.setName("Tom");
        student.displayInfo();
        student.setPoint(89);
        student.displayInfo();
    }
}
