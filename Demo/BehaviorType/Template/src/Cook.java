public abstract class Cook {
    public void process(){
        turnOnFire();//开火
        addOil();//倒油

        addAddVegatable();//加蔬菜
        addSauce();//加调味料
        fry();//翻炒
        dishingUp();//装盘
    }

    protected  void dishingUp(){
        System.out.println("大功告成，装盘上菜");
    }

    protected void fry(){
        System.out.println("翻炒10分钟");
    }

    protected abstract void addAddVegatable();

    protected abstract void addSauce();

    private void addOil() {
        System.out.println("倒入食用油");
    }

    private void turnOnFire() {
        System.out.println("打开煤气灶");
    }
}
