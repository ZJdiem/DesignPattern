public class StarSpeaker extends SpeakerDecorator {
    public StarSpeaker(Speakable speaker) {
        super(speaker);
    }

    @Override
    public void speak() {
        System.out.println("****");
        speaker.speak();
        System.out.println("****");
    }
}
