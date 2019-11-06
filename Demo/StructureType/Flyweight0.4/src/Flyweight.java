public class Flyweight {
    private static String colors[]=new String[]{"RED","GREEN","BLUE","YELLOW","WHITE","BLACK"};
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Circle circle=CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(getRandom());
            circle.show();
        }
    }

    private static int getRandom() {
        return (int)(Math.random()*100);
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

}
