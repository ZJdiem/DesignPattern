public abstract class SpeakerDecorator implements Speakable {
    protected Speakable speaker;

    public SpeakerDecorator(Speakable speaker) {
        this.speaker = speaker;
    }

    @Override
    public abstract void speak() ;
}
