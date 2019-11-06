public class Elevator {
    private EleDoorState doorState;
    private EleRunState runState;
    private EleStopState stopState;
    private ElevatorState state;
    public Elevator() {
        doorState=new EleDoorState(this);
        runState=new EleRunState(this);
        stopState=new EleStopState(this);
    }

    public void changeState(String stateName) {
        if(stateName.equals("DOOR"))state=doorState;
        else if(stateName.equals("RUN"))state=runState;
        else if(stateName.equals("STOP"))state=stopState;
    }

    public void goUp() {
        state.goUp();
    }

    public void goDown() {
        state.goDown();
    }

    public void closeDoor() {
        state.closeDoor();
    }

    public void openDoor() {
        state.openDoor();
    }
}
