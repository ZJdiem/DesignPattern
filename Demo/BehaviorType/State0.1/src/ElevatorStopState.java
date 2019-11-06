
public class ElevatorStopState implements ElevatorState {
    private Elevator el;
    private  int flag;
    public ElevatorStopState(Elevator el){
        this.el=el;
    }
    @Override
    public void ChangeState() {
        if(flag==1)el.setState("Run");
        else el.setState("Door");
    }

    @Override
    public void goUp() {
        System.out.println("电梯开始向指定楼层运行");
        flag=1;
        ChangeState();
    }

    @Override
    public void goDown() {
        System.out.println("电梯开始向指定楼层运行");
        flag=1;
        ChangeState();
    }

    @Override
    public void closeDoor() {
        System.out.println("关闭电梯门");
        flag=1;
        ChangeState();
    }

    @Override
    public void openDoor() {
        System.out.println("打开电梯门");
        flag=2;
        ChangeState();
    }

}
