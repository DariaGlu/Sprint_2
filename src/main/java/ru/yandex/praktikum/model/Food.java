package ru.yandex.praktikum.model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegeterian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public boolean getIsVegeterian() {
        return isVegeterian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

}
