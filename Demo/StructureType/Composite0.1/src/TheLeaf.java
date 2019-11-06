public class TheLeaf implements Component {
    private String name;

    public TheLeaf(String name) {
        this.name = name;
    }

    @Override
    public void selfCheck() {
        System.out.println(name+"自检...");
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void getChild(int i) {

    }
}
