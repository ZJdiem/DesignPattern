import java.util.ArrayList;
import java.util.List;

public class TheComposite implements Component {
    private String name;
    private List<Component> components=new ArrayList<>();
    public TheComposite(String name) {
        this.name = name;
    }

    @Override
    public void selfCheck() {
        System.out.println(name+"自检...");
        for(Component c:components)c.selfCheck();
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void getChild(int i) {
        components.get(i);
    }
}
