/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountcalculatorejbclient;

import DiscountCalculatorEJB.DiscountCalculatorBeanRemote;
import java.util.Scanner;
import javax.ejb.EJB;

/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
      @EJB
      private static DiscountCalculatorBeanRemote discountCalculatorBeanRemote;
      
      public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Discount Calculator EJB");
        
        System.out.println("Enter Initial Price: ");
        double initialPrice=input.nextDouble();
        
        System.out.println("Enter Discount: eg:10% put in 10 ");
        double discount=input.nextDouble();
        
       
        
        double finalPrice=discountCalculatorBeanRemote.calculateDiscount(initialPrice, discount);
        System.out.println("Final Price after discount: "+finalPrice);
        
    }
    
}
