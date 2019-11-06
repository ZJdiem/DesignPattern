public class CatMixedComparator implements Comparator<Cat> {
    @Override
    public boolean compare(Cat a, Cat b) {
        return a.getWeight()/a.getAge()>b.getWeight()/b.getAge();
    }
}
