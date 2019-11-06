public class ByLeg implements Goable {
    @Override
    public void go(MyTarget t) {
        System.out.println("吧嗒吧嗒去了"+t.getName());
    }
}
