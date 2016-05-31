import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list;
    
    public Phonebook() {
        list = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
//        Person entry = new Person(name, number);
//        list.add(entry);
        list.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person p : list) {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name) {
        for (Person p : list) {
            if (p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        return "number not known";
    }
}
