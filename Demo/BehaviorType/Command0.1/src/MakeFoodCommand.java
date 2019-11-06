public class MakeFoodCommand implements Commandable {

    @Override
    public void execute() {
        System.out.println("找厨师1洗菜，找厨师2炒菜，找厨师三上菜");
    }
}
