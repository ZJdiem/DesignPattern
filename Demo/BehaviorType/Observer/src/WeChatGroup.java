import java.util.ArrayList;
import java.util.List;

public class WeChatGroup implements Subject {
    private String str;
    private List<MyObserver> observers=new ArrayList<>();
    @Override
    public void setText(String str) {
        this.str=str;
        System.out.println("subject说："+str);
        notifyMsg();
    }

    @Override
    public void attach(MyObserver o) {
        observers.add(o);

    }

    @Override
    public void detach(MyObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyMsg() {
        for(MyObserver o:observers)o.update(str);

    }
}
