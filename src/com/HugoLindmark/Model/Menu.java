package com.HugoLindmark.Model;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private List<MenuItems> itemList = new ArrayList<>();
    private List<MenuItems> menuSortedByPrice = new ArrayList<>();
    private String menuFile = "C:\\Users\\hugol\\IdeaProjects\\InternShip\\src\\com\\HugoLindmark\\Model\\menu.txt";


    public void getMenuFromFile(){
        String content = "";
        File file = new File(menuFile);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String foodName = scanner.nextLine();
                String coast = scanner.nextLine();
                String[] splitPriceFromCurr = coast.split(" ");
                int price = Integer.parseInt(splitPriceFromCurr[0]);
                String currency = splitPriceFromCurr[1];
                String menuDivider = scanner.nextLine();
                MenuItems menuItems = new MenuItems(foodName,price,currency,menuDivider);
                itemList.add(menuItems);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public List<MenuItems> getMenu(){
        return itemList;
    }

    public void sortByPrice(){
      menuSortedByPrice  = itemList.stream().sorted(Comparator.comparing(MenuItems::getPrice)).collect(Collectors.toList());
    }

    public List<MenuItems> getMenuSortedByPrice(){
        return menuSortedByPrice;
    }

}
