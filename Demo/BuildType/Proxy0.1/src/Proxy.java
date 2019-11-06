public class Proxy {
    //MathInterface math;
    public static void main(String[] args) {
        MathInterface math=new MathProxy(new MathImp());
        System.out.println("add 10,20="+math.add(10,20));
        System.out.println("dec 10,20="+math.dec(10,20));
        System.out.println("mul 10,20="+math.mul(10,20));
        System.out.println("div 10,20="+math.div(10,20));
    }
}
