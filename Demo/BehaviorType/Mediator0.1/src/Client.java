public class Client {
    public static void main(String[] args) {
        President p=new President();
        Market m=new Market(p);
        DevelopDepartment d=new DevelopDepartment(p);
        Fanicial f=new Fanicial(p);
        m.selfAction();
        m.outAction();

    }
}
