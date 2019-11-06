public class Observer {
    public static void main(String[] args) {
        Subject subject=new WeChatGroup();
        MyObserver o1=new PolicyObserver();
        MyObserver o2=new PopularObserver();
        subject.attach(o1);
        subject.attach(o2);
        subject.setText("PHP是最好的语言");
        subject.detach(o1);
        subject.setText("Java才是最好的语言");
    }
}
