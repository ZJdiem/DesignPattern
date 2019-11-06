public class Fanicial implements Department {
    private Mediator m;

    public Fanicial(Mediator m) {
        this.m = m;
        m.regist("fanicial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("不断核查账本，厘清资金情况");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，目前还剩多少钱，在途多少钱");
    }
}
