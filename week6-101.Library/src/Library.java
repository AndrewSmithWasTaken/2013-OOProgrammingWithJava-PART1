import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> stock;

    public Library() {
        this.stock = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.stock.add(newBook);
    }
    
    public void printBooks() { 
        for (Book b : this.stock) {
            System.out.println(b);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b : this.stock) {
            if (StringUtils.included(b.title(), title)) {
                found.add(b);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b : this.stock) {
            if (StringUtils.included(b.publisher(), publisher)) {
                found.add(b);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b : this.stock) {
            if (b.year() == year) {
                found.add(b);
            }
        }
        return found;
    }
}
    
    

