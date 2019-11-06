public class Dog implements MyComparable {
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
    public boolean compareTo(MyComparable m) {
        return food>((Dog)m).getFood();
    }
    @Override
    public String toString(){
        return String.format("Dog[%d:%d]",food,fast);
    }
}
