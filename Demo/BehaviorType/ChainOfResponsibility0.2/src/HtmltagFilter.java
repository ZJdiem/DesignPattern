public class HtmltagFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace("<","[")
                .replace(">","]");
    }
}
