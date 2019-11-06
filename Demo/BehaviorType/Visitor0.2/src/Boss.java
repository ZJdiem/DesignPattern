public class Boss implements AccountBookViewer {
    private double totalConsume=0;
    private double totalIncome=0;
    @Override
    public void view(ConsumeBill bill) {
        totalConsume+=bill.getAmount();
    }

    @Override
    public void view(IncomeBill bill) {
        totalIncome+=bill.getAmount();
    }
    @Override
    public String toString(){
        return "支出:"+totalConsume+",收入"+totalIncome;
    }
}
