import java.util.Hashtable;

public class President implements Mediator {
    private Hashtable<String,Department> departments=
            new Hashtable<>();
    @Override
    public void regist(String dname,Department d) {
        departments.put(dname,d);
    }

    @Override
    public void command(String dname) {
        departments.get(dname).selfAction();
    }
}
