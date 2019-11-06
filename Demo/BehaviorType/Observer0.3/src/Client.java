public class Client {
    public static void main(String[] args) {
        WeChat weChat=new WeChat();
        RumorObserver ro=new RumorObserver();
        weChat.addObserver(ro);
        weChat.setMsg("敏感话题");
        System.out.println(ro.getMystate());
    }

}
