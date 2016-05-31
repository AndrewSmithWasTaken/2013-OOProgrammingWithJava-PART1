import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private static int d = Calendar.getInstance().get(Calendar.DATE);
    private static int m = Calendar.getInstance().get(Calendar.MONTH) + 1;
    private static int y = Calendar.getInstance().get(Calendar.YEAR);
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this(name, d, m, y);
    }
    
    public int age() {
        MyDate todaysDate = new MyDate(d,m,y);
        return todaysDate.differneceInYears(this.birthday);
    }
    
    public boolean olderThan(Person compared) {
        return birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
