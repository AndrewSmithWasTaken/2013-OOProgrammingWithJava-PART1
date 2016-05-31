import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account test1Acc = new Account("John", 100.00);
        test1Acc.deposit(20.0);
        System.out.println(test1Acc);
    }
}
