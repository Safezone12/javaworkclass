public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        // Create a new Student instance
        Student student = new Student("muk", "Teachers", "200");
        
        // Use the student object to display information
        student.displayInfo(); // This requires that Student class has displayInfo() method
    }
}
