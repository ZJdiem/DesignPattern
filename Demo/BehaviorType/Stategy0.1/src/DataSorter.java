public class DataSorter<T> {
    private T [] datas;
    public void setData(T [] datas){
        this.datas=datas;
    }
    public void sort(MyComparator<T> c){
        for(int i=0;i<datas.length;i++){
            for(int j=i+1;j<datas.length;j++){
                if(c.compare(datas[i],datas[j])){
                    T t=datas[i];
                    datas[i]=datas[j];
                    datas[j]=t;
                }
            }
        }
    }

    public void display() {
        for (T i:datas) System.out.print(i+" ");
        System.out.println();
    }
}
