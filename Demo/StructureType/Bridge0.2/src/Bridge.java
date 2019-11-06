public class Bridge
{
    public static void main(String[] args)
    {
        Shape shape=new Rectangle();
        shape.setColor(new Blue());
        shape.draw();
    }
}