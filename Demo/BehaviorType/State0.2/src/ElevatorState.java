public interface ElevatorState {
    void changeState();
    void goUp();
    void goDown();
    void closeDoor();
    void openDoor();
}
