package com.HugoLindmark.Model;

public class Facade {

    private Menu resturantMenu = new Menu();

    public Facade(){
        resturantMenu.getMenuFromFile();
        resturantMenu.sortByPrice();
    }

    public String displayMenu(){
        String menu = "";
        for (int i = 0; i < resturantMenu.getMenu().size(); i++){
            menu += resturantMenu.getMenu().get(i) + "\n";
        }
        return menu;
    }

    public String displaySortedMenu(){
        String menuSortedByPrice = "";
        for (int i = 0; i < resturantMenu.getMenuSortedByPrice().size(); i++) {
            menuSortedByPrice += resturantMenu.getMenuSortedByPrice().get(i) + "\n";
        }
        return menuSortedByPrice;
    }


    public boolean controlUserInput(String input){
        if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("No")){
            return true;
        }else {
            return false;
        }
    }

    public boolean checkUserInputType(String input){
        if (input.equalsIgnoreCase("Yes")){
            return true;
        }else {
            return false;
        }
    }

    public boolean confirmOrder(String input){
        if (input.equalsIgnoreCase("Confirm")){
            return true;
        }else {
            return false;
        }
    }

}
