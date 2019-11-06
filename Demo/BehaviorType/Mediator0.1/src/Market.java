public class Market implements Department{
    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.regist("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑来跑去跑市场，努力接项目");
    }

    @Override
    public void outAction() {
        System.out.println("协调开发部，开发项目");
        m.command("development");
    }
}
