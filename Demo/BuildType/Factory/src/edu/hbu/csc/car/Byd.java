package edu.hbu.csc.car;

public class Byd implements ICar {
    public void BydAddOil(){
        System.out.println("加满92号汽油");
    }
    @Override
    public void go(String target) {
        System.out.println("比亚迪滴滴滴的跑去"+target);
    }
}
