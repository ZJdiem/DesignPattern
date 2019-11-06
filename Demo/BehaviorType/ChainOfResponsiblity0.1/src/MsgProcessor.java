public class MsgProcessor {
    private String str;
    private FilterChain fc;
    private Filter filters[]={new HtmlFilter(),new SensitiveFilter()};

    public void setFc(FilterChain fc) {
        this.fc = fc;
    }

    public MsgProcessor(String str) {
        this.str = str;
    }

    public String process() {
        return fc.doFilter(str);
    }
}
