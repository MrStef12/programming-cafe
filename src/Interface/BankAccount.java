/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author stefh
 */
public class BankAccount implements Measurable {
    
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    @Override
    public double getMeasure() {
        return balance;
    }
    
}
