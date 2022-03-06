package com.company.factory.chair;

public class ModernChair implements Armchair {

    public ModernChair() {
    }

    @Override
    public void hasLegs() {
        System.out.println("modern chair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("modern chair is sit on");
    }
}
