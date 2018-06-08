package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InventoryMenu {
    private Scanner input = new Scanner(System.in);

    public void ManageInventory() {
        try {

            //find out what type of people to manage
            System.out.println("do you want to" + "\n1. Stock Products" + "\n2. buy a Product" + "\n3. go back" + "\n4. exit");
            //handles people management options
            switch (input.nextInt()) {
                case 1:
                    // Handle Employee
                    break;
                case 2:
                    //Handle Visitor
                    break;
                //Handle incorrect input
                case 3:
                    Menu mainMenu = new Menu();
                    mainMenu.mainMenu();

                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("please chose a valid option");
            ManageInventory();
        }
    }
}
