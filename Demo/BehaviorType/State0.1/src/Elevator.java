public class Elevator implements ElevatorState {
    private ElevatorState state;
    private ElevatorStopState stopState;
    private ElevatorRunState runState;
    private ElevatorDoorState doorState;

    public void setState(String sState){
        if(sState.equals("Door"))state=doorState;
        else if (sState.equals("Run"))state=runState;
        else if (sState.equals("Stop"))state=stopState;
    }

    public Elevator() {
        stopState = new ElevatorStopState(this);
        runState = new ElevatorRunState(this);
        doorState = new ElevatorDoorState(this);
    }
    @Override
    public void ChangeState() {
        state.ChangeState();
    }

    @Override
    public void goUp() {
        state.goUp();
    }

    @Override
    public void goDown() {
        state.goDown();
    }

    @Override
    public void closeDoor() {
        state.closeDoor();
    }

    @Override
    public void openDoor() {
        state.openDoor();
    }
}
