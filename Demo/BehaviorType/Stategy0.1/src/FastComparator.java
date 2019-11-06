public class FastComparator implements MyComparator<Dog> {
    @Override
    public boolean compare(Dog a, Dog b) {
        return a.getFast()>b.getFast();
    }
}
