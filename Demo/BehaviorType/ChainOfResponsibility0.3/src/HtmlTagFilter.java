public class HtmlTagFilter implements Filter {
    @Override
    public String doFilter(String s) {
        return s.replace("<","[")
                .replace(">","]");
    }
}
