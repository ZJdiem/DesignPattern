public class DataSorter<T> {
    T [] data;
    public DataSorter(T[] a) {
        data=a;
    }

    public void sort(Comparator<T> comp) {
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(comp.compare(data[i],data[j])){
                    T t=data[i];
                    data[i]=data[j];
                    data[j]=t;
                }
            }
        }
    }

    public void display() {
        for(T i:data) System.out.print(i+ " ");
        System.out.println();
    }
}
