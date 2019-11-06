public class Circle {
    private int x,y;
    private int radius;
    private String color;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }

    public void show() {
        System.out.printf("Circle[Color:%s,X:%d,Y:%d,Radius:%d]\n",color,x,y,radius);
    }
}
