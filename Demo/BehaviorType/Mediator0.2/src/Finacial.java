public class Finacial extends Department{
    public Finacial(Mediator m) {
        super(m);
        m.regist("FINACIAL",this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱，拨钱，再数钱，再拨钱");
    }

    @Override
    public void outAction() {
        System.out.println("向总经理汇报账目");
    }
}
