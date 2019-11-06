public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace("敏感","**");
    }
}
