public class Client {
    public static void main(String[] args) {
        Elevator el=new Elevator();
        el.setState("Stop");
        el.goUp();
        el.goDown();
        el.closeDoor();
        el.openDoor();
    }
}
