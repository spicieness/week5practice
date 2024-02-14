import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {

    private Map book;


    public AddressBook(Map book) {
        this.book = book;
    }


    public Map getBook() {
        return book;
    }

    public void setBook(Map book) {
        this.book = book;
    }


    @Override
    public String toString() {
        return "AddressBook{" +
                "book=" + book +
                '}';
    }

}
