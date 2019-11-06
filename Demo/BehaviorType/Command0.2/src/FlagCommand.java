public class FlagCommand implements Command {
    private Soilder[] soilders={
        new Soilder("张三","挖坑"),
            new Soilder("李四","扶旗杆"),
            new Soilder("王五","填土"),
            new Soilder("刘六","踩实"),
    };
    @Override
    public void execute() {
        for(Soilder s:soilders)s.doAction();
    }
}
