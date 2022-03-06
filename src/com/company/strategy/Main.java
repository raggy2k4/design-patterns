package com.company.strategy;

import com.company.strategy.cook.CookEggs;
import com.company.strategy.cook.CookSoup;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Marcin");

        chef.setCookStrategy(new CookEggs());

        chef.cook();

        chef.setCookStrategy(new CookSoup());

        chef.cook();

    }
}
