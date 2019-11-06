import java.util.Iterator;

public class MyStrs implements Iterable<String> {
    private String strs[]=new String[]{"AAA","BBB","CCC","DDD","EEE"};


    @Override
    public Iterator<String> iterator() {
        return new MyStrsIterator();
    }


    private class MyStrsIterator implements Iterator<String>{
        private int pos=-1;

        @Override
        public boolean hasNext() {
            return pos<strs.length-1;
        }

        @Override
        public String next() {
            if(pos<strs.length-1)pos++;
            return strs[pos];
        }

    }
}
