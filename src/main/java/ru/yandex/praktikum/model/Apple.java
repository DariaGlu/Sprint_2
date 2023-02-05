package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        isVegeterian = true;
    }

    @Override
    public double getDiscount() {
        if (this.colour.equals(Colour.RED_COLOUR)) {
            return Discount.DISCOUNT;
        } else {
            return Discount.NO_DISCOUNT;
        }
    }

}

