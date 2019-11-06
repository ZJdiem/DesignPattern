import java.util.List;

public class MessageProcessor {
    private FilterChain fc;

    public FilterChain getFc() {
        return fc;
    }

    public void setFc(FilterChain fc) {
        this.fc = fc;
    }

    public String process(String s) {

        return fc.doFilter(s);

    }
}
