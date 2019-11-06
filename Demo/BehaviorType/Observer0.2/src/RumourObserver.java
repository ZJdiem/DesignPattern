public class RumourObserver implements Observer {
    @Override
    public void Update(String str) {
        System.out.println("他们在说"+str+"哎");
    }
}
