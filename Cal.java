/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.project;

import java.util.Scanner;

/**
 *
 * @author sita
 */
public class Cal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        float x = input.nextFloat();
        System.out.println("Enter 2nd number:");
        float y = input.nextFloat();
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Divide");
        System.out.println("4.Multiply");
        System.out.println("Enter your command:");
        
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                result = x + y;
                break;
            case 2:
                result = x - y;
                break;
            case 3:
                result = x / y;
                break;
            case 4:
                result = x * y;
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }
        System.out.println("The result is " + result);
               
                       
                       
        // TODO code application logic here
    }

}
}
    
}
