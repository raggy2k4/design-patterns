package com.company.factory.fruitfactory.factory;

import com.company.factory.fruitfactory.Apple;
import com.company.factory.fruitfactory.Orange;

public class SimpleFruitFactory {

    public Apple createApple() {
        return new Apple();
    }

    public Orange createOrange() {
        return new Orange();
    }


}
