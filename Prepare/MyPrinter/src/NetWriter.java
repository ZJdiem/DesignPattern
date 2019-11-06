public class NetWriter implements Writable{
    @Override
    public void write(char c) {
        System.out.println("从网络上输出"+c);
    }
}
