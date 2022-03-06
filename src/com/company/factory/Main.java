package com.company.factory;

public class Main {
    public static void main(String[] args) {

        ChairFactory chairFactory = ChairFactory.getInstance();
        Armchair modern = chairFactory.getArmchair(ChairFactoryEnum.MODERN_CHAIR);

        modern.hasLegs();
        modern.sitOn();

        Armchair vintage = chairFactory.getArmchair(ChairFactoryEnum.VINTAGE_CHAIR);

        vintage.hasLegs();
        vintage.sitOn();

    }
}
