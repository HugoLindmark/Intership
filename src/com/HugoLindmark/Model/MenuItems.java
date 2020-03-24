package com.HugoLindmark.Model;

public class MenuItems {

    private String foodName;
    private int price;
    private String currency;
    private String divider;

    public MenuItems(String foodName, int price,String currency, String divider) {
        this.foodName = foodName;
        this.price = price;
        this.currency = currency;
        this.divider = divider;

    }

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }




    @Override
    public String toString() {
        return "Dish: " + foodName +
                " Price: " + price + "kr" ;
    }
}
