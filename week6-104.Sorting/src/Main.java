import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int smallest(int[] array) {
        
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    
        int smallest = array[index];
        int ix = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                ix = i;
            }
        }
        return ix;    
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array){
        
        for (int i = 0; i < array.length-1; i++) {
             int theIndexOfTheSmallest = indexOfTheSmallestStartingFrom(array, i);
             swap(array, i, theIndexOfTheSmallest);
        }
    }
}




