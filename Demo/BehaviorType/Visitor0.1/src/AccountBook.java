import java.util.ArrayList;
import java.util.List;

public class AccountBook {
    private List<Bill> bills=new ArrayList<>();
    public void add(Bill bill){
        bills.add(bill);
    }
    public void show(AccountBookViewer v){
        for(Bill bill:bills){
            bill.accept(v);
        }
    }
}
