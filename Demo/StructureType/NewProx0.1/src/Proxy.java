public class Proxy {
    public static void main(String[] args) {
        Addable addable=new HarddiskAdd(new SimpleAdd());
        Addable addable1=new NetAdd(addable);
        System.out.println(addable1.add(10,20));
    }
}
