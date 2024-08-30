public class Student {
       
    public int point;
    public String name;
    public String major;
     
    //Constructor
   
 public Student(String name, String major, String string) {
            this.name = name;
            this.major = major;
            this.point = Integer.parseInt(string); // Convert string to int
        }

   public String getName(){
    return name;
   }
   public void setName(String name) {
    this.name = name; // Correctly assigns the parameter value to the field
}
   public String getMajor() {
    return major;
   }
   public void setMajor(String major){
      this.major = major;
   }
   public int getPoint(){
    return point;
   }
   public void setPoint(int point) {
    
   
    if (point > 0) {
            this.point = point; 
        }
    }
    

   public void displayInfo(){
    System.out.println("Student Name: "+name);
    System.out.println("Student Major: "+major);
    System.out.println("Student Point: "+point);
   }
}    
     

