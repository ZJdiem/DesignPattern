public class Students implements Aggregate {
    private String [] students={"张三","李四","王五","刘六"};
    @Override
    public Iterator CreateIterator() {
        return new StudentsIterator();
    }
    private class StudentsIterator implements Iterator{
        private int pos=-1;
        @Override
        public void first() {
            pos=0;
        }

        @Override
        public void next() {
            if(!isDone())pos++;
        }

        @Override
        public boolean isDone() {
            return pos==students.length;
        }

        @Override
        public String currentItem() {
            return students[pos];
        }
    }
}
