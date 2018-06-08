package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    public void mainMenu() {





        System.out.println("Please Choose an option " +
                "\n1. manage Animals" +
                "\n2. manage People" +
                "\n3. manage Inventory" +
                "\n4. Exit");
        try {
            switch (input.nextInt()) {
                case 1:
                    manageAnimals();
                    break;
                case 2:
                    PeopleMenu peoplemenu = new PeopleMenu();
                    peoplemenu.ManagePeople();
                    break;
                case 3:
                    InventoryMenu inventoryMenu = new InventoryMenu();
                    inventoryMenu.ManageInventory();
                    break;
                case 4:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter a number from 1 to 3");
                    mainMenu();
                    break;
            }
        }  catch(InputMismatchException ime) {
            input.nextLine();
            System.out.println("please enter a number from 1 to 3");
            mainMenu();

        }
    }


    private void manageAnimals() {

    }




}
