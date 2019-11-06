public class Develop extends Department{
    public Develop(Mediator m) {
        super(m);
        m.regist("DEVELOP",this);
    }

    @Override
    public void selfAction() {
        System.out.println("天天写代码，时时做项目");
    }

    @Override
    public void outAction() {
        System.out.println("要求财务部给资金支持");
        m.command("FINACIAL");
    }
}
