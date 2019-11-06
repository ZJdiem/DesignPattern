public class FlyWeight {
    public static void main(String[] args) {
        CDFactory cdFactory=new CDFactory();
        CD cd=cdFactory.getCD("cuijian");
        CD cd2=cdFactory.getCD("cuijian");
        CD cd3=cdFactory.getCD("cuijian");
        CD cd4=cdFactory.getCD("111");
        cd.show();
        cd2.show();
        cd3.show();
        cd4.show();



    }
}
