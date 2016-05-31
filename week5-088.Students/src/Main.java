import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.println("name:");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("studentnumber");
            String stuid = reader.nextLine();
            
            //Student stu = new Student(name, stuid);
            //list.add(stu);
            list.add(new Student(name, stuid));
        }
        //System.out.println("result:");
        for (Student stu : list) {
            System.out.println(stu);
        }
        
        System.out.println("Give search term:");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student stu : list) {
            if (stu.getName().contains(search)) {
                System.out.println(stu);
            }
        }
    }
}
