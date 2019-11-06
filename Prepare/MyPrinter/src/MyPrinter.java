import java.io.*;

public class MyPrinter {
    private int flag=0;
    public static void main(String[] args) throws IOException {
        char c;
        Readable reader=new NetReader();
        Writable writer=new NetWriter();
//        while ((c=(char)System.in.read())!='\n')
//            if(flag==0)System.out.println("打字机上打印"+c);
//            else System.out.println("屏幕上显示"+c);
        while((c=reader.read())!='\n')writer.write(c);
    }
}
