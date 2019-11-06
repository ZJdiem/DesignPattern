public class ElevatorDoorState implements ElevatorState {
    private Elevator el;
    public ElevatorDoorState(Elevator el){
        this.el=el;
    }
    @Override
    public void ChangeState() {
        el.setState("Stop");
    }

    @Override
    public void goUp() {
        System.out.println("记下楼层");
    }

    @Override
    public void goDown() {
        System.out.println("记下楼层");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
        ChangeState();
    }

    @Override
    public void openDoor() {
        System.out.println("开门");
    }
}
