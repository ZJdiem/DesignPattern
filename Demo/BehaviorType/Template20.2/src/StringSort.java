public class StringSort extends AbstractSort {
    public StringSort(Object[] objects) {
        super(objects);
    }

    @Override
    protected boolean biggerThan(Object o1, Object o2) {
        char a=String.valueOf(o1).charAt(0);
        char b=String.valueOf(o2).charAt(0);
        return a>b;
    }

    @Override
    public void show() {
        for(Object o:objects) System.out.println(String.valueOf(o));
    }
}
