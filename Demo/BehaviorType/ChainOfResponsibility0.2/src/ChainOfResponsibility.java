public class ChainOfResponsibility {
    public static void main(String[] args) {
        String str="<html>,敏感,:),AAA,BBB....";
        MsgProcessor processor=new MsgProcessor(str);
        System.out.println(processor.process());
    }


}
