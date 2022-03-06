package com.company.factory.fruitfactory.abstarctfactory;

import com.company.factory.fruitfactory.Orange;

public class OrangeFactory extends AbstractFruitFactory {

    public Orange createOrange() {
        return new Orange();
    }
}
