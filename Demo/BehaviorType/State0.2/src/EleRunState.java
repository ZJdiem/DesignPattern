public class EleRunState implements ElevatorState {
    private Elevator el;
    private String stateName;
    public EleRunState(Elevator el) {
        this.el = el;
    }

    @Override
    public void changeState() {
        el.changeState(stateName);
    }

    @Override
    public void goUp() {
        System.out.println("向相应楼层运行，到达相应楼层转换为静止状态");
        stateName="STOP";
        changeState();
    }

    @Override
    public void goDown() {
        System.out.println("向相应楼层运行，到达相应楼层转换为静止状态");
        stateName="STOP";
        changeState();
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
