public class Invoker {
    private Commandable command;

    public Commandable getCommand() {
        return command;
    }

    public void setCommand(Commandable command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}
