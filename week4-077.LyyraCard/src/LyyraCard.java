/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + this.balance + " Euros";
    }
    
    public void payEconomical() {
        if (balance >= 2.5) {
            balance = balance - 2.5;
        }
    }

    public void payGourmet() {
        if (balance >= 4.0) {
            balance = balance - 4.0;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount > 0.0) {
            if ((balance + amount) > 150.0) {
            balance = 150.0;
            }
            else balance += amount;
        }
    } 
}