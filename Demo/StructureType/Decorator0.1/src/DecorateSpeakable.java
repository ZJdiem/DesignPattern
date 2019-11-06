public abstract class DecorateSpeakable implements Speakable {
    public void setSpeakable(Speakable speakable) {
        this.speakable = speakable;
    }

    protected Speakable speakable;
    @Override
    public abstract void speak();
}
