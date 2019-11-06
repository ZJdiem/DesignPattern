public class PopularObserver implements MyObserver {
    @Override
    public void update(String str) {
        System.out.println("他们在说["+str+"]哎");
    }
}
