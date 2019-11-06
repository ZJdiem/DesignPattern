public class Client {
    public static void main(String[] args) {
        CareTaker taker=new CareTaker();
        Emp emp=new Emp("张三",20,3000);
        System.out.printf("ename:%s age:%d salary:%f\n",
                emp.getEname(),
                emp.getAge(),
                emp.getSalary());
        taker.setEmpMemento(emp.memento());
        emp.setEname("李四");
        emp.setAge(23);
        emp.setSalary(2500);
        System.out.printf("ename:%s age:%d salary:%f\n",
                emp.getEname(),
                emp.getAge(),
                emp.getSalary());
        emp.recovery(taker.getEmpMemento());
        System.out.printf("ename:%s age:%d salary:%f\n",
                emp.getEname(),
                emp.getAge(),
                emp.getSalary());

    }
}

