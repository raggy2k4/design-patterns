package com.company.factory;

public class VintageChair implements Armchair{

    public VintageChair() {
    }

    @Override
    public void hasLegs() {
        System.out.println("vintage chair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("vintage chair is sit on");
    }
}
