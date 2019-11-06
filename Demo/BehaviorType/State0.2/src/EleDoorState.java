public class EleDoorState implements ElevatorState{
    private Elevator el;

    private String stateName;
    public EleDoorState(Elevator el) {
        this.el = el;
    }

    @Override
    public void changeState() {
        el.changeState(stateName);
    }

    @Override
    public void goUp() {
        System.out.println("记下指定楼层");
    }

    @Override
    public void goDown() {
        System.out.println("记下指定楼层");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
        stateName="STOP";
        changeState();
    }

    @Override
    public void openDoor() {
        System.out.println("打开门");
    }
}
