public class Client {
    public static void main(String[] args) {
        Cat [] a={new Cat(3,5),
                new Cat(1,3),
                new Cat(6,4),
                new Cat(9,8),
                new Cat(7,10)};
        Dog[] d={
                new Dog(3,3),
                new Dog(4,4),
                new Dog(8,2),
                new Dog(6,10),
                new Dog(9,9)};
        DataSorter ds=new DataSorter(a);
        ds.sort(new CatAgeComparator());
        ds.display();
        ds.sort(new CatWeightComparator());
        ds.display();
        ds.sort(new CatMixedComparator());
        ds.display();
    }
}
