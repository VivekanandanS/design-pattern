package com.sinewave.creational.factorymethod.prototype;

public class ProductCreator implements Creator {
    @Override
    public Product create(int productId) {
        if (productId == 1)
            return new MyProduct();
        if (productId == 2)
            return new YourProduct();
        return new TheirProduct();
    }
}
