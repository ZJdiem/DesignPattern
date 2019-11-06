public interface Component {
    void selfCheck();
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
}
