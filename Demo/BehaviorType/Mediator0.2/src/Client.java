public class Client {
    public static void main(String[] args) {
        Mediator m=new President();
        Department develop=new Develop(m);
        Department market=new Market(m);
        Department finacial=new Finacial(m);
        market.selfAction();
        market.outAction();
    }


}
