public abstract class AbstractCook {
    public void Cook(){
        TurnOnFire();
        AddOil();
        AddConghua();
        AddVegetable();
        AddTiaoliao();
        Dishup();
    }

    private void Dishup(){
        System.out.println("装盘上菜");
    };

    protected abstract void AddVegetable();
    protected abstract void AddTiaoliao();
    private void AddOil() {
        System.out.println("倒入少许花生油，加热片刻");
    }

    private void AddConghua() {
        System.out.println("加入葱花");
    }

    private void TurnOnFire() {
        System.out.println("打开燃气灶");
        System.out.println("放锅开火");
    }

}
