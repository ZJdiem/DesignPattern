public class CharFilter implements Filter {
    @Override
    public String doFilter(String str) {
        return str.replace("AAA","BBB");
    }
}
