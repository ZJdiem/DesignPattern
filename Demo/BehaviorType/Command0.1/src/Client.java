public class Client {
    public static void main(String[] args) {
        Invoker general=new Invoker();
        general.setCommand(new FlagCommand());
        general.executeCommand();
        general.setCommand(new MakeFoodCommand());
        general.executeCommand();
    }
}
