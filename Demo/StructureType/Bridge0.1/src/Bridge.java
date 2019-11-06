public class Bridge {
    public static void main(String[] args) {
        ColorShape colorShape=new Ellipse();
        colorShape.setColor(new MyBlack());
        colorShape.draw();
    }
}
