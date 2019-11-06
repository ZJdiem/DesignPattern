public class Circle {
    private String color;
    private int x,y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

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

    public void show() {
        System.out.printf("circle[Color:%s,x:%d,y:%d,R:%d\n",color,x,y,radius);
    }
}
