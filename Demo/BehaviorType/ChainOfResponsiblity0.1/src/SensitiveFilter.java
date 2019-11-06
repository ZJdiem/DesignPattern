public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String str) {
        return str.replace("敏感","**");
    }
}
