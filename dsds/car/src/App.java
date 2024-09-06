public class App {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car("Toyota Ae86", 1986);
        myCar.displayInfo();

        myCar.setBrand("Honda EK9");
        myCar.setYear(1990);

        myCar.displayInfo();
    }
}
