public abstract class ColorShape {
    public void setColor(MyColor color) {
        this.color = color;
    }

    protected MyColor color;
    public abstract void draw();
}
