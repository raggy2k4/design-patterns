package com.company.factory.fruitfactory.abstarctfactory;

import com.company.factory.fruitfactory.Apple;

public class AppleFactory extends AbstractFruitFactory {

    public Apple createApple(){
        return new Apple();
    }

}
