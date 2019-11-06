public class PrinterWriter implements Writable{
    @Override
    public void write(char c) {
        System.out.println("在打字机上打印"+c);
    }
}
