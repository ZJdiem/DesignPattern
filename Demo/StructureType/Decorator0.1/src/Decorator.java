public class Decorator {
    public static void main(String[] args) {
        Speakable speakable=new CatSpeaker();
        DecorateSpeakable sp=new StarDecorateSpeakable();
        DecorateSpeakable sp2=new SharpDecorateSpeakable();
        DecorateSpeakable sp3=new SharpDecorateSpeakable();
        sp.setSpeakable(speakable);
        sp2.setSpeakable(sp);
        sp3.setSpeakable(sp2);
        sp3.speak();
    }
}
