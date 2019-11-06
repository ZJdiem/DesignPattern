package edu.hbu.csc.car;

public class FordCarFactory implements ICarFactory{
    private Ford ford=null;
    @Override
    public void fistStep() {
        ford=new Ford();
        ford.FordFullCharge();
    }

    @Override
    public ICar getCar() {
        return ford;
    }
}
