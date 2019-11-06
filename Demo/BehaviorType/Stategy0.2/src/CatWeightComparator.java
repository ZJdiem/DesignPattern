public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public boolean compare(Cat a, Cat b) {
        return a.getWeight()>b.getWeight();
    }
}
