package edu.hbu.csc.car;

public class Audi implements ICar {
    public void AudiAddOil(){
        System.out.println("奥迪加满95号汽油");
    }
    @Override
    public void go(String target) {
        System.out.println("奥迪滴滴滴的去了"+target);
    }
}
