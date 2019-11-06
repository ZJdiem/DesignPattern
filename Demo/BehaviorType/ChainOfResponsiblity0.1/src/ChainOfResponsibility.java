public class ChainOfResponsibility {
    public static void main(String[] args) {
        String str="<br>,敏感，:),楼市泡沫，就业难，AAA";
        MsgProcessor processor=new MsgProcessor(str);
        FilterChain fc=new FilterChain();
        fc.add(new HtmlFilter())
            .add(new SensitiveFilter())
            .add(new FaceFilter());
        FilterChain fc2=new FilterChain();
        fc2.add(fc).add(new CharFilter());
        processor.setFc(fc2);
        System.out.println(processor.process());
    }
}
