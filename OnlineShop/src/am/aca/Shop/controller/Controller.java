package am.aca.Shop.controller;

import am.aca.Shop.resource.Variable;

import java.util.Scanner;

public class Controller {


    public void executor(){
        Variable variable = new Variable();
        Scanner input = new Scanner(System.in);
        String comman;
        comman = input.nextLine();

        System.out.println(variable.welcome);
        System.out.println(variable.adminOrUser);
        while(true){
            switch(comman){
                case "Admin":
                    admin();
                    break;
                case "Customer":
                    customer();
                    break;
                case "Register":
                    register();
                    break;
                case "RogIn":
                    logIn();
                    break;
                case "Discount items":
                    discountItems();
                    break;
                case "aboutProduct":
                    aboutProduct();
                    break;
                case "Add product": //if -> admin
                    addProduct();
                    break;
                case "Show user info": //if -> admin
                    showUserInfo();
                    break;
            }
        }
    }

    private void showUserInfo() {
    }

    private void addProduct() {
    }

    private void aboutProduct(){  // @st id i  ta ira infon

    }

    private void discountItems() {

    }

    private void customer() {
        
    }

    private void admin() {
        
    }

    public void register(){

    }
    public void logIn(){

    }
}
