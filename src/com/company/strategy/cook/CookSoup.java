package com.company.strategy.cook;

public class CookSoup implements CookStrategy{

    @Override
    public void cook() {
        System.out.println("I have cooked soup.");
    }

}
