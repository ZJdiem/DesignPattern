public class Client {
    public static void main(String[] args) {
        Subject subject=new WechatGroup();
        Observer o1=new RumourObserver();
        Observer o2=new PoliceObserver();
        subject.attach(o1);
        subject.attach(o2);
        ((WechatGroup) subject).setText("敏感话题");
        ((WechatGroup) subject).setText("网络空间安全与计算机学院是个好学院");
        subject.dettach(o1);
        ((WechatGroup) subject).setText("C语言过时啦");
    }

}
