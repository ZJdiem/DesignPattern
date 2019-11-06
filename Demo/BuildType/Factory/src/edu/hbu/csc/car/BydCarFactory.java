package edu.hbu.csc.car;

public class BydCarFactory implements ICarFactory {
    private Byd byd=null;
    @Override
    public void fistStep() {
        byd=new Byd();
        byd.BydAddOil();
    }

    @Override
    public ICar getCar() {
        return byd;
    }
}
