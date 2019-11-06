public class MathProxy implements MathInterface {
    private MathInterface math;

    public MathProxy(MathInterface math) {
        this.math = math;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("从网络传输数据");
        int r=math.add(a,b);
        System.out.println("清理连接");
        return r;
    }

    @Override
    public int dec(int a, int b) {
        System.out.println("从网络传输数据");
        int r=math.dec(a,b);
        System.out.println("清理连接");
        return r;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("从网络传输数据");
        int r=math.mul(a,b);
        System.out.println("清理连接");
        return r;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("从网络传输数据");
        int r=math.div(a,b);
        System.out.println("清理连接");
        return r;
    }
}
