package com.ocr.anthony;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - Boeuf");
        System.out.println("2 - Poulet");
        System.out.println("3 - Végétarien");
        System.out.println("Que Souhaitez-Vous Comme Menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        switch (nbMenu) {
            case 1:
                System.out.println("Vous avez choisi comme menu : Boeuf");
                break;
            case 2:
                System.out.println("Vous avez choisi comme menu : Poulet");
                break;
            case 3:
                System.out.println("Vous avez choisi comme menu : Végétarien");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
                break;
        }
    }
}