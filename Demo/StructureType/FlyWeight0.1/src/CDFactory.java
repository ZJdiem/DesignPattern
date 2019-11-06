public class CDFactory {
    private CD cd1=new CuiJianCD();
    private CD cd2=new YangyuyingCD();
    public CD getCD(String name){
        if(name.toLowerCase().equals("cuijian")) return cd1;
        else if(name.toLowerCase().equals("yangyuying")) return cd2;
        else return new NormalCD();
    }

}
