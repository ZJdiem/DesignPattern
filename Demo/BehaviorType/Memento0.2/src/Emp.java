public class Emp {
    private String ename;
    private int age;
    private double salary;

    public EmpMemento createMemento(){
        return new EmpMemento(this);
    }
    public void restore(EmpMemento empMemento){
        this.ename=empMemento.getEname();
        this.age=empMemento.getAge();
        this.salary=empMemento.getSalary();
    }
    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
