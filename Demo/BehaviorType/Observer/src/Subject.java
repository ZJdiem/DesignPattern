public interface Subject {
    public void setText(String str);
    public void attach(MyObserver o);
    public void detach(MyObserver o);
    public void notifyMsg();
}
