public class Soldier {
    private String name;
    private String act;

    public Soldier(String name,String act) {
        this.name = name;
        this.act=act;
    }
    public void action(){
        System.out.println(name+"在做"+act+"...");
    }
}
