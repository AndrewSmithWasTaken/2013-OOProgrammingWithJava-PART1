/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() { 
        this.value += 1;
        if (this.value > upperLimit) {
            this.value = 0;
        }
    }
    
    @Override
    public String toString() {
        return "" + String.format("%02d", this.value);
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int unit) {
        if (unit >= 0 && unit <= upperLimit) {
            this.value = unit;
        }
    }
}
