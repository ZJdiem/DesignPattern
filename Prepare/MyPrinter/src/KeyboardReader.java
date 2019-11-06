import java.io.IOException;
import java.util.Scanner;

public class KeyboardReader implements Readable {
    @Override
    public char read() throws IOException {
        System.out.println("从键盘上输入");
        return (char)System.in.read();
    }
}
