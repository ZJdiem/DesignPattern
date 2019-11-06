import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author：Z&J
 * E-mail: 320647879@qq.com
 * 版本：1.0
 * 创建日期：2019/11/4 11:01
 * 类描述-Description：
 */
public class Classes implements Iterable<People>
{
    private List<People> peoples=new ArrayList<>();
    public void addPeople(People people)
    {
        peoples.add(people);
    }
    @Override
    public Iterator<People> iterator()
    {
        return new ClassesIterator();
    }
    private class ClassesIterator implements Iterator<People>
    {
        private int index=-1;
        @Override
        public boolean hasNext()
        {
            return index<peoples.size()-1;
        }
        @Override
        public People next()
        {
            if(hasNext())
            {
                index++;
            }
            return peoples.get(index);
        }
    }
}