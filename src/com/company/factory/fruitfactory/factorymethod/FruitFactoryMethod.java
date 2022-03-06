package com.company.factory.fruitfactory.factorymethod;

import com.company.factory.fruitfactory.Apple;
import com.company.factory.fruitfactory.Fruit;
import com.company.factory.fruitfactory.Orange;

public class FruitFactoryMethod {

    public Fruit createFruit(FruitEnum fruitType) {
        switch (fruitType) {
            case APPLE -> {
                return new Apple();
            }
            case ORANGE -> {
                return new Orange();
            }
            default -> {
                return null;
            }
        }
    }

}
