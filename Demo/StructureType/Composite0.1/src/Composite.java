public class Composite {
    public static void main(String[] args) {
        Component root=new TheComposite("计算机");
        Component leaf1=new TheLeaf("键盘");
        Component leaf2=new TheLeaf("显示器");
        Component leaf3=new TheLeaf("鼠标");
        Component comLeaf1=new TheComposite("机箱");
        Component comLeaf21=new TheComposite("主板");
        Component leaf22=new TheLeaf("硬盘");
        Component leaf23=new TheLeaf("电源");
        Component leaf31=new TheLeaf("CPU");
        Component leaf32=new TheLeaf("显卡");
        Component leaf33=new TheLeaf("网卡");
        comLeaf21.add(leaf31);
        comLeaf21.add(leaf32);
        comLeaf21.add(leaf33);
        comLeaf1.add(comLeaf21);
        comLeaf1.add(leaf22);
        comLeaf1.add(leaf23);
        root.add(leaf1);
        root.add(leaf2);
        root.add(comLeaf1);
        root.add(leaf3);
        root.selfCheck();
    }
}
