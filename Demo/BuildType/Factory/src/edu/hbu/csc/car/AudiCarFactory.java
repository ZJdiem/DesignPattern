package edu.hbu.csc.car;

public class AudiCarFactory implements ICarFactory {
    private Audi audi;
    @Override
    public void fistStep() {
        audi=new Audi();
        audi.AudiAddOil();
    }

    @Override
    public ICar getCar() {
        return audi;
    }
}
