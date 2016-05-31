
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differneceInYears(MyDate compared) {
        int diff = 0;
        if (compared.earlier(this)) {
            diff = this.year - compared.year;
            if (compared.month > this.month) {
                diff--;
            }
            if (compared.month == this.month && compared.day > this.day) {
                diff--;
            }
            return diff;
        } else {
            diff = compared.year - this.year;
            if (compared.month < this.month) {
                diff--;
            }
            if (compared.month == this.month && compared.day < this.day) {
                diff--;
            }
            return diff;
        }
    }

  
}