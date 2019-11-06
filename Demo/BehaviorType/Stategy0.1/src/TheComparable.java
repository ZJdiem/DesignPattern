public class TheComparable {

    //private static  int [] datas={3,5,7,2,10,8};
    private static Cat[] cats={new Cat(3,8),
            new Cat(5,10),
            new Cat(2,5),
            new Cat(8,6),
            new Cat(10,12),
            new Cat(9,11)
    };
    private static Dog[] dogs={
            new Dog(12,12),
            new Dog(5,11),
            new Dog(9,12),
            new Dog(7,12),
            new Dog(3,12),
            new Dog(6,12),
            new Dog(0,12),
            new Dog(1,12),
    };
    public static void main(String[] args) {
        DataSorter<Cat> ds=new DataSorter<>();
        ds.setData(cats);
        ds.sort(new CatAgeComparator());
        ds.display();
    }


}
