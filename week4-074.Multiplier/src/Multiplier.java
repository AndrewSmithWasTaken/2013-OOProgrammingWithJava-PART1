/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class Multiplier {
    
    private final int mult;
    
    public Multiplier(int number) {
        this.mult = number;
    }
    
    public int multiply(int otherNumber) {
        return otherNumber * this.mult;
    }
}
