package com.HugoLindmark.View;

import com.HugoLindmark.Controller.Controller;

import java.util.Scanner;

public class View {

    private String input;

    public View (){

     Controller controller = new Controller(this);
     Scanner scanner = new Scanner(System.in);

        System.out.println("Hi!");
        System.out.println("Welcome to our resturant!");
        System.out.println("Our menu is:");
        System.out.println(controller.conDisplayMenu());
        while (true){
            System.out.println("Would you like to see the menu sorted by price?");
            System.out.println("Type Yes to see menu, or No to continue");
            input = scanner.nextLine();

            if (!controller.conControlUserInput(input)){
                System.out.println("Invalid input, Type Yes or No, please try again");
            }else {
                break;
            }
        }

        if (controller.conCheckUserInputType(input)) {
            System.out.println(controller.conDisplaySortedMenu());
        }
        while (true){
            System.out.println("Have you decided or do you wish to see the menu again?");
            System.out.println("Type Yes to see the menu again, or Confirm to confirm order");
            input = scanner.nextLine();
            if (controller.conCheckUserInputType(input)){
                System.out.println(controller.conDisplayMenu());
            }else if (controller.conConfirmOrder(input)){
                System.out.println("Excellent choice, the waitress will be with you shortly!");
                System.exit(0);
                break;
            }
        }
    }
}
