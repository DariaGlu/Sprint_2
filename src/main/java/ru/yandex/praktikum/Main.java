package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.service.ShoppingCart;

import static ru.yandex.praktikum.model.constants.Colour.GREEN_COLOUR;
import static ru.yandex.praktikum.model.constants.Colour.RED_COLOUR;

public class Main {

    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, RED_COLOUR);
        Food greenApple = new Apple(8, 60, GREEN_COLOUR);


        Food[] products = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println("Итоговая сумма покупок без скидки " + shoppingCart.getPriceWithoutDiscount() + " руб.");
        System.out.println("Итоговая сумма покупок со скидкой " + shoppingCart.getPriceWithDiscount() + " руб.");
        System.out.println("Итоговая сумма вегететарианских продуктов без скидки " + shoppingCart.getVegeterianFullPrice() + " руб.");

    }
}
