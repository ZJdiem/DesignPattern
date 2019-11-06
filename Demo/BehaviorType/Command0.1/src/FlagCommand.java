public class FlagCommand implements Commandable{
    private Soldier[] soldiers=new Soldier[]{
            new Soldier("张三","挖坑"),
            new Soldier("李四","扶旗杆"),
            new Soldier("王五","填土"),
            new Soldier("刘班长","踩实"),
    };

    @Override
    public void execute() {
        for(Soldier s:soldiers)s.action();
    }
}
