public class MathImp implements MathInterface {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int dec(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
