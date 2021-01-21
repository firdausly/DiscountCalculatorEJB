package DiscountCalculatorEJB;


import javax.ejb.Remote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alang
 */

@Remote
public interface DiscountCalculatorBeanRemote {
    public double calculateDiscount(double initialPrice,double discount);
}
