public class Student {
    public String name;
    public String major;
    public int point;
    
    public Student(String name, String major, String string) {
        this.name = name;
        this.major = major;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void displayinfo(){
        System.out.println("Student name:"+ name);
        System.out.println("Student major:"+ major);
        System.out.println("Student point:"+ point);
    }
}
