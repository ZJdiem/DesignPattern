public class CookCommand implements Command {

    @Override
    public void execute() {
        System.out.println("张三摘菜");
        System.out.println("李四炒菜");
        System.out.println("王五上菜");
        System.out.println("刘六刷锅");
    }
}
