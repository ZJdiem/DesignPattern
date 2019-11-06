public class HbuFilter implements Filter{
    @Override
    public String doFilter(String s) {
        return s.replace("河北大学","北大");
    }
}
