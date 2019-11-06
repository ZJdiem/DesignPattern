public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String s) {
        return s.replace("敏感","**");
    }
}
