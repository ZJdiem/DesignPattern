public class CPA implements AccountBookViewer {
    @Override
    public void view(ConsumeBill bill) {
        if(bill.getItem().equals("工资")){
            System.out.println("CPA检查工资是否上税");
        }
    }

    @Override
    public void view(IncomeBill bill) {
        System.out.println("收入单据都要检查是否上税");
    }
}
