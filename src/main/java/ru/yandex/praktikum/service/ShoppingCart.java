package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.constants.Discount;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getPriceWithoutDiscount() {
        double totalSum = 0;

        for (int i = 0; i < products.length; i++) {
            totalSum += products[i].getPrice() * products[i].getAmount();
        }
        return totalSum;
    }

    public double getPriceWithDiscount() {
        double totalSum = 0;
        double discount = 1;
        for (int i = 0; i < products.length; i++) {

            if (products[i].getDiscount() == Discount.NO_DISCOUNT) {
                discount = 1;
            } else {
                discount = 1 - Discount.DISCOUNT / 100;
            }
            totalSum += products[i].getPrice() * discount * products[i].getAmount();

        }
        return totalSum;
    }

    public double getVegeterianFullPrice() {
        double totalSum = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getIsVegeterian()) {
                totalSum += products[i].getPrice() * products[i].getAmount();
            }
        }
        return totalSum;

    }
}
