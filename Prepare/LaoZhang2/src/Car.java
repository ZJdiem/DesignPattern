public class Car extends Vehicle implements Goable {

    public void go(MyTarget t) {
        System.out.println("滴滴滴的去了"+t.getName());
    }
}
