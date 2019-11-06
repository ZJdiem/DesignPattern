public class StarDecorateSpeakable extends DecorateSpeakable {
    @Override
    public void speak() {
        System.out.println("*****");
        speakable.speak();
        System.out.println("*****");
    }
}
