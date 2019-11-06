public class Soilder {
    private String name;
    private String actionName;

    public Soilder(String name, String actionName) {
        this.name = name;
        this.actionName = actionName;
    }
    public void doAction(){
        System.out.printf("战士%s在%s\n",name,actionName);
    }
}
