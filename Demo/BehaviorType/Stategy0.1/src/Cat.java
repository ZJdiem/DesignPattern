public class Cat implements MyComparable {
    private int age;
    private int weight;

    public Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public boolean compareTo(Cat other){
        return this.weight>other.getWeight();
    }
    @Override
    public String toString(){
        return age+"|"+weight;
    }

    @Override
    public boolean compareTo(MyComparable m) {
        return this.weight>((Cat)m).getWeight();
    }
}
