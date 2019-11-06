public interface ElevatorState {
    void ChangeState();
    void goUp();//电梯外按钮功能
    void goDown();//电梯外按钮功能
    void closeDoor();//电梯内
    void openDoor();//电梯内
}
