public class MixFoodFastComparator implements MyComparator<Dog>{
    @Override
    public boolean compare(Dog a, Dog b) {
        return a.getFood()*a.getFast()>b.getFood()*b.getFast();
    }
}
