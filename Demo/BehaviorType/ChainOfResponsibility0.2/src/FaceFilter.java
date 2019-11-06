public class FaceFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace(":)","^v^");
    }
}
