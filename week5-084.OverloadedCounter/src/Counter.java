/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew
 */
public class Counter {
    
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return value;
    }
    
    public void increase() {
        //value++;
        increase(1);
    }
    
    public void decrease() {
        if (!check || (check && value -1 >= 0)) {
            value--;
        }
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            value += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return;
        }
        if (!check || (check && value - decreaseAmount >= 0)) {
            value -= decreaseAmount;
        }
        while (check) {
            if (value - decreaseAmount < 0) {
                value = 0;
                return;
            }
        }
    }
}