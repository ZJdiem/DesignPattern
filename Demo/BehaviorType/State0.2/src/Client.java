public class Client {
    public static void main(String[] args) {
        Elevator el=new Elevator();
        el.changeState("STOP");
        el.goUp();
        el.goDown();
        el.closeDoor();
        el.openDoor();
    }
}
