package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {

    private Scanner input = new Scanner(System.in);

    public void ManagePeople() {
        try {

            //find out what type of people to manage
            System.out.println("are you" + "\n1. an Employee" + "\n2. a Visitor" + "\n3. go back" + "\n4. exit");
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
                    Menu mainmenu = new Menu();
                    mainmenu.mainMenu();

                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("please chose a valid option");
            ManagePeople();
        }
    }
}
