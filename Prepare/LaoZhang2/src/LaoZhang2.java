import java.lang.annotation.Target;

public class LaoZhang2 {
    public static void main(String[] args) {
//        String employeeName="老张";
//        String target="东北";
//        String vehicle="车";
//
//        System.out.println(employeeName+"开"+vehicle+"去"+target);
        Employee employee=new Employee("老张");
        employee.go(new MyTarget("东北"));
    }
}
