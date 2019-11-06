public class HarddiskAdd implements Addable {
    private Addable addable;

    public HarddiskAdd(Addable addable) {
        this.addable = addable;
    }

    @Override
    public int add(int x, int y) {
        System.out.println("读取硬盘数据");
        int r=addable.add(x,y);
        System.out.println("清理读取");
        return r;
    }
}
