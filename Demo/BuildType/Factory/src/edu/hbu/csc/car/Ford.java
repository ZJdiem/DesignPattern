package edu.hbu.csc.car;

public class Ford implements ICar {
    public void FordFullCharge(){
        System.out.println("福特车充满电");
    }
    @Override
    public void go(String target) {
        System.out.println("福特车嗖一下去了"+target);
    }
}
