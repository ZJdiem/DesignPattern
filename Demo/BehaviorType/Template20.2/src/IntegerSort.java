public class IntegerSort extends AbstractSort {
    public IntegerSort(Object[] objects) {
        super(objects);
    }

    @Override
    protected boolean biggerThan(Object o1, Object o2)
    {
        return (Integer)o1>(Integer)o2;
    }

    @Override
    public void show() {
        for(Object o:objects) System.out.println((Integer)o);
    }
}
