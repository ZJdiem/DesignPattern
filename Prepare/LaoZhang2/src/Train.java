public class Train extends Vehicle implements Goable{
    @Override
    public void go(MyTarget t) {
        System.out.println("逛吃逛吃的去了"+t.getName());
    }
}
