public class Client {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Emp emp;
        emp=new Emp("张三",20,3000);
        careTaker.setEmpMemento(emp.createMemento());
        System.out.printf("姓名:%s 年龄:%d 工资:%f\n",
                emp.getEname(),
                emp.getAge(),
                emp.getSalary());
        emp.setEname("李四");
        emp.setAge(30);
        System.out.printf("姓名:%s 年龄:%d 工资:%f\n",
                emp.getEname(),
                emp.getAge(),
                emp.getSalary());
        emp.restore(careTaker.getEmpMemento());
        System.out.printf("姓名:%s 年龄:%d 工资:%f\n",
                emp.getEname(),
                emp.getAge(),
                emp.getSalary());
    }
}
