import java.awt.*;
import java.util.Hashtable;

public class StyleTemplate {
    private Hashtable<String,Style> styles=new Hashtable<>();

    public StyleTemplate() throws CloneNotSupportedException {
        ColorSet cs=new ColorSet();
        Style s=new Style();
        cs.setFillColor(Color.BLACK);
        cs.setEageColor(Color.WHITE);
        s.setColorSet(cs);
        s.setLineWidth((float)2.0);
        styles.put("cool1",s.clone());
        cs.setFillColor(Color.BLUE);
        cs.setEageColor(Color.YELLOW);
        s.setLineWidth((float)2.0);
        styles.put("cool2",s.clone());
    }
    public Style getTemplate(String tempName) throws CloneNotSupportedException {
        return styles.get(tempName).clone();
    }
}
