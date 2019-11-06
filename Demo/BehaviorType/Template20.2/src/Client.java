public class Client {
    public static void main(String[] args) {
        Integer[] intArr=new Integer[]{1,5,3,9,10,2};
        String[] strArr=new String []{"AAA","AVG","XXX","GYH","UYT"};
        AbstractSort s=new StringSort(strArr);
        s.show();
        s.sort();
        System.out.println("=============");
        s.show();
    }
}
