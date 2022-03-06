package com.company.strategy;

import com.company.strategy.cook.CookStrategy;

public class Chef {

    String name;
    CookStrategy cookStrategy;

    public void cook(){
        cookStrategy.cook();
    }


    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CookStrategy getCookStrategy() {
        return cookStrategy;
    }

    public void setCookStrategy(CookStrategy cookStrategy) {
        this.cookStrategy = cookStrategy;
    }
}
