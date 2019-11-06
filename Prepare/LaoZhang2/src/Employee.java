public class Employee {
    private String name;
    private Goable g=new ByLeg();
    public Employee(String name) {
        this.name=name;
    }
    public void go(MyTarget t){
        System.out.print(name);
        g.go(t);
    }
}
