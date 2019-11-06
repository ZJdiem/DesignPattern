import java.util.ArrayList;
import java.util.List;

public class MsgProcessor {
    private String str;
    private FilterChain fc=new FilterChain();

    public MsgProcessor(String str) {
        this.str=str;
        fc.add(new FaceFilter())
        .add(new SensitiveFilter())
        .add(new HtmltagFilter());
    }


    public String process() {
        return fc.doFilter(str);

    }
}
