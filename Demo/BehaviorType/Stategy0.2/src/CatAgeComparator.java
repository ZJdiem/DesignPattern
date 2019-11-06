public class CatAgeComparator implements Comparator<Cat> {
    @Override
    public boolean compare(Cat a, Cat b) {
        return a.getAge()>b.getAge();
    }
}
