public class CPA implements AccountBookViewer{
    @Override
    public void view(ConsumeBill bill) {
        if(bill.getItem().equals("工资"))
            System.out.println("CPA检查工资");
    }

    @Override
    public void view(IncomeBill bill) {
        System.out.println("CPA检查"+bill.getItem());
    }
}
