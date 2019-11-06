public class Client {
    public static void main(String[] args) {
        String s="敏感，:),<script>,河北大学，AAABB大大";
//        SensitiveFilter f1=new SensitiveFilter();
//        FaceFilter f2=new FaceFilter();
        FilterChain fc=new FilterChain();
//        fc.add(f1);
//        fc.add(f2);
        fc.add(new SensitiveFilter())
                .add(new FaceFilter())
                .add(new HtmlTagFilter());
        FilterChain fc2=new FilterChain();
        fc2.add(fc)
                .add(new HbuFilter());
        MessageProcessor mp=new MessageProcessor();
        mp.setFc(fc2);
        System.out.println(mp.process(s));
    }
}
