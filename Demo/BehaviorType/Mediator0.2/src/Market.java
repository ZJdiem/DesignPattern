public class Market extends Department {
    public Market(Mediator m) {
        super(m);
        m.regist("MARKET",this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑来跑去跑市场");
    }

    @Override
    public void outAction() {
        System.out.println("把项目交付给研发部开发");
        m.command("DEVELOP");
        System.out.println("没钱了，财务部给钱");
        m.command("FINACIAL");
    }
}
