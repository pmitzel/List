/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab3;

import java.util.Scanner;

/**
 *
 * @author PETER MITZEL
 */
public class Outlab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Initializing a scanner, instance of the linked list class, instance of the file manager class and the user choice for manuel input
        Scanner scanner = new Scanner(System.in);
        LinkedList myList = new LinkedList();
        FileManager loader = new FileManager();
        int userChoice;
        //Do while loop to handle the menu system
        do{
            System.out.println("Press 1 to load list from file\nPress 2 to load list with individual item from user input\nPress 3 to print list in order\nPress 4 to print list backwards\nPress 5 to remove item\nPress 6 to delete entire list\nPress -1 to exit");
            userChoice = scanner.nextInt();
            switch(userChoice){
                case -1: System.out.println("\nGOODBYE\n"); 
                        break;
                case 1: System.out.println("\nLOAD LIST FROM FILE\n");
                        System.out.println("\nEnter the name of the file :\n");
                        String input = scanner.next();
                        loader.fileLoader(input, myList);
                        System.out.println("\n");
                        break;
                case 2: System.out.println("\nLOAD LIST WITH INDIVIDUAL ITEM FROM USER INPUT\n");
                        String array [] = new String [3];
                        System.out.println("Enter the ID number: \n");
                        array[0] = scanner.next();
                        System.out.println("Enter the last name: \n");
                        array[1] = scanner.next();
                        System.out.println("Enter the first name: \n");
                        array[2] = scanner.next();
                        Node custom = new Node(array[0].trim(), array[1].trim(), array[2].trim());
                        myList.addNode(custom);
                        System.out.println("\n");
                        break;
                case 3: System.out.println("\nPRINT LIST IN ORDER\n");
                        myList.caseThree();
                        System.out.println("\n");
                        break;
                case 4: System.out.println("\nPRINT LIST BACKWARDS\n");
                        myList.caseFour();
                        System.out.println("\n");
                        break;
                case 5: System.out.println("\nREMOVE ITEM\n");
                        String someArray [] = new String [3];
                        System.out.println("Enter the ID number: \n");
                        someArray[0] = scanner.next();
                        System.out.println("Enter the last name: \n");
                        someArray[1] = scanner.next();
                        System.out.println("Enter the first name: \n");
                        someArray[2] = scanner.next();
                        Node someCustom = new Node(someArray[0].trim(), someArray[1].trim(), someArray[2].trim());
                        boolean n = myList.caseFive(someCustom);
                        if(n == true){
                            System.out.println("\nDeleted\n");
                        }
                        if(n == false){
                            System.out.println("\nError, could not delete\n");
                        }
                        break;
                case 6: System.out.println("\nDELETE ENTIRE LIST\n");
                        myList.caseSix();
                        break;
                default: System.out.println("\nINVALID INPUT\n");
                        break;
            }
        }while (userChoice != -1);
    }
    
}
