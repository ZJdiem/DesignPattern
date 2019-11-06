import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    private List<Filter> filters=new ArrayList<>();
    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }
    public void remove(Filter filter){
        filters.remove(filter);
    }
    @Override
    public String doFilter(String s) {
        String str=s;
        for(Filter f:filters)str=f.doFilter(str);
        return str;
    }
}
