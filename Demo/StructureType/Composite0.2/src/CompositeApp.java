public class CompositeApp {
    public static void main(String[] args) {
        Component c1=new Composite("计算机");
        Component c2=new Composite("键盘");
        Component c3=new Composite("显示器");
        Component c4=new Composite("机箱");
        Component c5=new Composite("鼠标");
        Component c6=new Composite("主板");
        Component c7=new Composite("硬盘");
        Component c8=new Composite("电源");
        Component c9=new Composite("CPU");
        Component c10=new Composite("显卡");
        Component c11=new Composite("网卡");
        c6.add(c9);
        c6.add(c10);
        c6.add(c11);
        c4.add(c6);
        c4.add(c7);
        c4.add(c8);
        c1.add(c2);
        c1.add(c3);
        c1.add(c4);
        c1.add(c5);
        c1.selfCheck();




    }
}
