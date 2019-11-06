public class Dog  implements Compare<Dog> {
    private int food;
    private int fast;

    public Dog(int food, int fast) {
        this.food = food;
        this.fast = fast;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    @Override
    public boolean compare(Compare<Dog> t) {
        return ((Dog)t).getFood()>food;
    }
    @Override
    public String toString(){
        return "[Dog]"+food+":"+fast;
    }
}
