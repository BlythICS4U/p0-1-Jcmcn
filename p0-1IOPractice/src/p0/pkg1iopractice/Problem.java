/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0.pkg1iopractice;
import java.util.Scanner;
/**
 *
 * @author Joca
 */
public class Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        /*First Problem
        double principal1;
        double rate1;
        double time1;
        double total1;
        System.out.println("Enter the principal");
        principal1 = keyboard.nextDouble();
        System.out.println("Enter the rate");
        rate1 = keyboard.nextDouble();
        System.out.println("Enter the years");
        time1 = keyboard.nextDouble();
        total1 = principal1*time1*rate1;
        System.out.println("The interest is " + total1);
        */
        
        /*Second Problem
        double hours2;
        double rate2;
        System.out.println("Enter the Hours");
        hours2 = keyboard.nextDouble();
        System.out.println("Enter the Hourly Rate (dollars)");
        rate2 = keyboard.nextDouble();
        double final2 = hours2*rate2;
        System.out.println("The Pay Is " + final2);
        */
        
        /* Third Problem
        double quantity3;
        double price3;
        System.out.println("Enter the Quantity");
        quantity3 = keyboard.nextDouble();
        System.out.println("Enter the Price");
        price3 = keyboard.nextDouble();
        double final3 = quantity3*price3;
        System.out.printf("The Cost is $%.2f ", final3);
        */
        
        /* Fourth Problem
        double height4;
        double base4;
        System.out.println("Enter the base lenght");
        base4 = keyboard.nextDouble();
        System.out.println("Enter the height");
        height4 = keyboard.nextDouble();
        double total4 = height4*base4/2;
        System.out.printf("The Area is %.1f ", total4);
        */
        
        /* Fifth Problem
        double capacity5;
        double weight5;
        System.out.println("Enter the lifting capacity");
        capacity5 = keyboard.nextDouble();
        System.out.println("Enter the average adult weight");
        weight5 = keyboard.nextDouble();
        double total5 = capacity5/weight5; 
        System.out.printf("The safe capacity is %1d \n", (int) total5);
        */
        
        /* Sixth Problem
        double donuts6;
        System.out.println("Enter the amount of donuts");
        donuts6 = keyboard.nextDouble();
        double extra6 = donuts6 % 12;
        int boxes6 = (int)(donuts6/12);
        System.out.println("The amount of boxes needed are " + boxes6 + "\nThe amount of donuts to the food bank is " + extra6);
        */
        
        /* Seventh Problem
        double value7;
        System.out.println("Enter the number of cents");
        value7 = keyboard.nextDouble();
        int quarter7 = (int)(value7/25);
        int dime7 = (int)((value7-quarter7*25)/10);
        int nickle7 = (int)((value7-quarter7*25-dime7*10)/5);
        int pennie7 = (int)((value7-quarter7*25-dime7*10-nickle7*5)/1);
        System.out.println("The amount of quarters is " + quarter7 + "\nThe amount of dimes is " + dime7 + "\nThe amount of nickles is " + nickle7 + "\nThe amount of pennies is " + pennie7);
        */
        
        
        /*Eighth Problem*/
        double value8;
        System.out.println("Enter the number of cents");
        value8 = keyboard.nextDouble();
        int twenty8 = (int)(value8/2000);
        int ten8 = (int)((value8-twenty8*2000)/1000);
        int five8 = (int)((value8-twenty8*2000-ten8*1000)/500);
        int two8 = (int)((value8-twenty8*2000-ten8*1000-five8*500)/200);
        int one8 = (int)((value8-twenty8*2000-ten8*1000-five8*500-two8*200)/100);
        int quarter8 = (int)((value8-twenty8*2000-ten8*1000-five8*500-two8*200-one8*100)/25);
        int dime8 = (int)((value8-twenty8*2000-ten8*1000-five8*500-two8*200-one8*100-quarter8*25)/10);
        int nickle8 = (int)((value8-twenty8*2000-ten8*1000-five8*500-two8*200-one8*100-quarter8*25-dime8*10)/5);
        int pennie8 = (int)((value8-twenty8*2000-ten8*1000-five8*500-two8*200-one8*100-quarter8*25-dime8*10-nickle8*5)/1);
        System.out.println("The amount of twenties is " + twenty8);
        System.out.println("The amount of tens is " + ten8);
        System.out.println("The amount of fives is " + five8);
        System.out.println("The amount of twos is " + two8);
        System.out.println("The amount of ones is " + one8);
        System.out.println("The amount of quarters is " + quarter8);
        System.out.println("The amount of dimes is " + dime8);
        System.out.println("The amount of nickles is " + nickle8);
        System.out.println("The amount of pennies is " + pennie8);
        
                
                
    }
    
}
