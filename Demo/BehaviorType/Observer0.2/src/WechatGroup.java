import java.util.ArrayList;
import java.util.List;

public class WechatGroup implements Subject {
    private List<Observer> observers=new ArrayList<>();
    private String theStr;
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void dettach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyMsg() {
        for(Observer o:observers)o.Update(theStr);
    }
    public void setText(String str){
        theStr=str;
        notifyMsg();

    }
}
