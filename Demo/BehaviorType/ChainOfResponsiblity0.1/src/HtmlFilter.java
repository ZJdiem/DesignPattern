public class HtmlFilter implements Filter {
    public String doFilter(String str){
        return str.replace("<","[").replace(">","]");
    }
}
