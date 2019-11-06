public class SharpSpeaker extends SpeakerDecorator {
    public SharpSpeaker(Speakable speaker) {
        super(speaker);
    }

    @Override
    public void speak() {
        System.out.println("#####");
        speaker.speak();
        System.out.println("#####");
    }
}
