public class ElevatorRunState implements ElevatorState{
    private Elevator el;
    public ElevatorRunState(Elevator el){
        this.el=el;
    }
    @Override
    public void ChangeState() {
        el.setState("Stop");
    }

    @Override
    public void goUp() {
        System.out.println("记住楼层，如果和电梯方向一致，到该楼层转为停止状态");
        ChangeState();
    }

    @Override
    public void goDown() {
        System.out.println("记住楼层，如果和电梯方向一致，到该楼层转为停止状态");
        ChangeState();
    }

    @Override
    public void closeDoor() {
        System.out.println("无效");
    }

    @Override
    public void openDoor() {
        System.out.println("无效");

    }
}
