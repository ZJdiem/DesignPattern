public class FaceFilter implements Filter{
    @Override
    public String doFilter(String s) {
        return s.replace(":)","^v^");
    }
}
