public class FoodComparator implements MyComparator<Dog> {
    @Override
    public boolean compare(Dog a, Dog b) {
        return a.getFood()>b.getFood();
    }
}
