import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    private List<Filter> filters=new ArrayList<>();
    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }
    @Override
    public String doFilter(String msg) {
        String r=msg;
        for(Filter f:filters)r=f.doFilter(r);
        return r;
    }
}
