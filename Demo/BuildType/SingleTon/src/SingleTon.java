public class SingleTon {
    public static void main(String[] args) {
        Car car1=Car.getInstance();
        Car car2=Car.getInstance();
        if(car1==car2) System.out.println("same");
        System.out.println(car1);
        System.out.println(car2);
        car1.go("东北");
    }
}
