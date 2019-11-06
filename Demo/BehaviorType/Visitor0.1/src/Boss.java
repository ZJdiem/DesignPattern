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

    public double getTotalConsume() {
        System.out.println("老板花了"+totalConsume);
        return totalConsume;
    }

    public double getTotalIncome() {
        System.out.println("老板赚了"+totalIncome);
        return totalIncome;
    }
}
