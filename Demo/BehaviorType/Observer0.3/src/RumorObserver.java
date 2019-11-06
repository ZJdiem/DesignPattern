import java.util.Observable;
import java.util.Observer;

public class RumorObserver implements Observer {
    public String getMystate() {
        return "哈哈"+mystate.substring(2);
    }

    public void setMystate(String mystate) {
        this.mystate = mystate;
    }

    private String mystate;
    @Override
    public void update(Observable o, Object arg) {
        WeChat w=(WeChat)o;
        mystate=((WeChat) o).getMsg();
        System.out.println("流言[["+mystate+"]]");
    }
}
