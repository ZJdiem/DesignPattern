public class Decorator {
    public static void main(String[] args) {
        Speakable sp=new CatSpeaker();
        StarSpeaker sp2=new StarSpeaker(sp);
        SharpSpeaker sp3 =new SharpSpeaker(sp2);
        SharpSpeaker sp4 =new SharpSpeaker(sp3);
        StarSpeaker sp5=new StarSpeaker(sp4);
        sp5.speak();
    }
}
