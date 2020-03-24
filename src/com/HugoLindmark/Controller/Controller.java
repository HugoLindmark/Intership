package com.HugoLindmark.Controller;

import com.HugoLindmark.Model.Facade;
import com.HugoLindmark.View.View;

public class Controller {

    private View view;
    private Facade facade = new Facade();

    public Controller(View view){
        this.view = view;
    }

    public String conDisplayMenu(){
        return facade.displayMenu();
    }

    public String conDisplaySortedMenu(){
        return facade.displaySortedMenu();
    }

    public boolean conControlUserInput(String input){
        return facade.controlUserInput(input);
    }

    public boolean conCheckUserInputType(String input){
        return facade.checkUserInputType(input);
    }

    public boolean conConfirmOrder(String input){
        return facade.confirmOrder(input);
    }

}

