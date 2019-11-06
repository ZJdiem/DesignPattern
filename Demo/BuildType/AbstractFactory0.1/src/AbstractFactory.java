 public class AbstractFactory {
    public static void main(String[] args) {
        Director director=new Director();
        director.operate();
        /*IAbstractFactory factory=new RichFactory();
        ICar car=factory.createCar();
        IFOOD food=factory.createFood();
        food.eat();
        car.go();*/
    }
}
