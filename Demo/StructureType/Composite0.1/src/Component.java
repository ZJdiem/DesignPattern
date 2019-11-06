public interface Component {
    void selfCheck();
    void add(Component component);
    void remove(Component component);
    void getChild(int i);
}
