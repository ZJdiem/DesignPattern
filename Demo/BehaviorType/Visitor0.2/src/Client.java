public class Client {
    public static void main(String[] args) {
        AccountBook ab=new AccountBook();
        ab.add(new ConsumeBill(2000,"买设备"));
        ab.add(new ConsumeBill(5000,"工资"));
        ab.add(new IncomeBill(10000,"项目1"));
        ab.add(new IncomeBill(20000,"项目2"));
        AccountBookViewer v1=new Boss();
        AccountBookViewer v2=new CPA();
        ab.show(v1);
        ab.show(v2);
        System.out.println(v1.toString());
    }

}
