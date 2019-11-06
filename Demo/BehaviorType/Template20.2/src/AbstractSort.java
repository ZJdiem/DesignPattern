public abstract class AbstractSort {
    protected Object[] objects;

    public AbstractSort(Object[] objects) {
        this.objects = objects;
    }
    protected abstract boolean biggerThan(Object o1,Object o2);
    public void sort(){
        int i,j;
        for(i=0;i<objects.length;i++){
            for(j=i+1;j<objects.length;j++){
                if(biggerThan(objects[j],objects[i])){
                    Object o=objects[i];
                    objects[i]=objects[j];
                    objects[j]=o;
                }
            }
        }
    }
    public abstract void show();
}
