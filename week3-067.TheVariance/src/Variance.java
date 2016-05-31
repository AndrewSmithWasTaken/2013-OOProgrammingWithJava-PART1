import java.util.ArrayList;

public class Variance {
    
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double divisor = list.size();
        return sum(list) / divisor;
    }

    public static double variance(ArrayList<Integer> list) {
        double mean = average(list);
        ArrayList<Double> workList = new ArrayList<Double>();
        for (Integer num : list) {
            workList.add((num-mean)*(num-mean));
        }
        double sum = 0;
        for (Double num : workList) {
            sum += num;
        }
        return sum / (workList.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
