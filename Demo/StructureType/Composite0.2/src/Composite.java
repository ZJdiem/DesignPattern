import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    private List<Component> components=new ArrayList<>();
    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void selfCheck() {
        System.out.println(name+"自检中...");
        if(!components.isEmpty()){
            for(Component c:components){
                c.selfCheck();
            }
        }
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
    public Component getChild(int i) {
        return components.get(i);
    }
}
