public class EleStopState implements ElevatorState {

    private Elevator el;
    private String stateName;
    public EleStopState(Elevator el) {
        this.el = el;
    }


    @Override
    public void changeState() {
        el.changeState(stateName);
    }

    @Override
    public void goUp() {
        System.out.println("电梯启动运行，向指定楼层运动");
        stateName="RUN";
        changeState();
    }

    @Override
    public void goDown() {
        System.out.println("电梯启动运行，向指定楼层运动");
        stateName="RUN";
        changeState();
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯启动运行，向记忆楼层运动");
        stateName="RUN";
        changeState();
    }

    @Override
    public void openDoor() {
        System.out.println("电梯开门");
        stateName="DOOR";
        changeState();
    }
}
