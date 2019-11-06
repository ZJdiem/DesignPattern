public class NetAdd implements Addable{
    private Addable addable;

    public NetAdd(Addable addable) {
        this.addable = addable;
    }

    @Override
    public int add(int x, int y) {
        System.out.println("处理网络传输数据");
        int r=addable.add(x,y);
        System.out.println("清理网络连接");
        return r;
    }
}
