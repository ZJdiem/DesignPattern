public class CatAgeComparator implements MyComparator<Cat> {
    @Override
    public boolean compare(Cat a, Cat b) {
        return a.getAge()>b.getAge();
    }
}
