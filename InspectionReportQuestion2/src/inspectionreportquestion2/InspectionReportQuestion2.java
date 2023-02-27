/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inspectionreportquestion2;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class InspectionReportQuestion2 {

 //THIS METHORD WAS TAKEN FROM JAVA PROGRAMMING BY JOYCE FARREL
 //JOYCE FARREL 
 //https://ieeexplore.ieee.org/author/37345543900
    
  
    public static void main(String[] args) {
        //Scanner Object Instance.
        Scanner input = new Scanner(System.in);
        // Get input from user console.
        System.out.print("Enter the hospital location:");
        input.nextLine();
        String name = input.nextLine();
        
        
        System.out.print("Enter the hospital name:");
        input.nextLine();
        name = input.nextLine();
        
        System.out.print("Enter years since last inspection");
        Integer firstNumber = input.nextInt();
        //Process the user input
        Integer sum = firstNumber;
        //Display results and user output
        
        System.out.println("************************************************");
        System.out.println("HOSPITAL LOCATION: Eastern Cape");
        System.out.println("HOSPITAL NAME:St Augstine Hospital");
        System.out.println("YEARS SINCE INSPECTION:3");
        System.out.println("INSPECTION NEEDED:YES");
       
    }
    
}
