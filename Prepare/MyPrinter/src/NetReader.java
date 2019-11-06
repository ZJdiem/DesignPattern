import java.io.IOException;

public class NetReader implements Readable{
    @Override
    public char read() throws IOException {
        System.out.println("从网络上输入");
        return (char)System.in.read();
    }
}
