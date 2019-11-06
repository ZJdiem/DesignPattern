public class Client {
    public static void main(String[] args) {
        Students stus=new Students();
        Iterator it=stus.CreateIterator();
        it.first();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
}
