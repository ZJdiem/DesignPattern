import java.util.Iterator;

public class Students implements Iterable<String>
{
    private String [] students={"zhangsan","lisi","wangwu","liuliu"};
    @Override
    public Iterator<String> iterator() {
        return new StudentsIterator();
    }
    private class StudentsIterator implements Iterator<String>
    {
        private int pos=-1;
        @Override
        public boolean hasNext() {
            return pos<students.length-1;
        }

        @Override
        public String next() {
            if(hasNext())pos++;
            return students[pos];
        }
    }
}
