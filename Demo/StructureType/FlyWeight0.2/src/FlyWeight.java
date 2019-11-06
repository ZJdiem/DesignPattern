
public class FlyWeight {
    private static String colors[]=new String[]{"RED","GREEN","BLUE","YELLOW","BLACK","WHITE"};
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Circle circle=CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(getRandom());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandom(){
        return (int)(Math.random()*100);
    }
}
