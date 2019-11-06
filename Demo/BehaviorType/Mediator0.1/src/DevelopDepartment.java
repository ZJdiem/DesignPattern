public class DevelopDepartment implements Department {
    private Mediator m;

    public DevelopDepartment(Mediator m) {
        this.m = m;
        m.regist("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("埋头开发，整理软件结构");
    }

    @Override
    public void outAction() {
        System.out.println("汇报情况，资金短缺，要钱");
        m.command("fanicial");

    }
}
