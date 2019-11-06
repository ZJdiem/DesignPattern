public abstract class Department {
    protected Mediator m;
    public Department(Mediator m){
        this.m=m;
    }
    public abstract void selfAction();
    public abstract void outAction();
}
