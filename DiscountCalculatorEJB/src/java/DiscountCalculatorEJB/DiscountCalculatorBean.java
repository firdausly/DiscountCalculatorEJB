package DiscountCalculatorEJB;

import java.util.Scanner;
import javax.ejb.Stateless;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alang
 */
@Stateless
public class DiscountCalculatorBean implements DiscountCalculatorBeanRemote{

   
    
    @Override
    public  double calculateDiscount(double initialPrice, double discount) {
    
        return (100-discount)*initialPrice/100;
    }
    
}
