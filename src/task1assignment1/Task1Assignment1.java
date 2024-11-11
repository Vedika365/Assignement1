/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1assignment1;
import java.util.Scanner;


/**
 *
 * @author Vedika Jain 
 */
public class Task1Assignment1 {
    public static void main(String[] args) {
        

        // Create a Scanner object for user input
        Scanner info = new Scanner(System.in);

        // prompt the user for his personal information
        System.out.print("Please enter your name: ");
        String Name = info.nextLine();
       
        System.out.print("Please enter your age: ");
        int age = info.nextInt();
        info.nextLine();
        
        System.out.print("Please enter your gender: ");
        String gender = info.nextLine();
       
        System.out.print("Please enter your departement: ");
        String departement =info.nextLine();
        
        System.out.print("Please enter the value of PI(3.1415926): ");
        double pi = info.nextDouble();
       
        //make a String out of ":" to have more control over it 
        String colonString = ":";
        
        //Display information 
        System.out.printf("\n Name %16s %2s",colonString,  Name);
        System.out.printf("\n Age  %16s %s", colonString, age);
        System.out.printf("\n Gender %14s %2s", colonString, gender);
        System.out.printf("\n Departement  %8s %2s",colonString, departement);
        System.out.printf("\n PI %18S %2S \n ",colonString, pi);
        
    }
}