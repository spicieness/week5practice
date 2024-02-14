import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Dylan Olson  Exercise 5  2/13/2024

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("dyl", "emailman@mail.com");
        Person person2 = new Person("byl", "emailperson@mail.com");
        Person person3 = new Person("jyl", "emailwoman@mail.com");




        HashMap<String, String> addressBook = new HashMap<String, String>();

        addressBook.put(person1.getName(), person1.getEmail());
        addressBook.put(person2.getName(), person2.getEmail());
        addressBook.put(person3.getName(), person3.getEmail());

        addContact(addressBook);
        search(addressBook);

        System.out.println(addressBook);









    }

    static void addContact(HashMap a){
        a.put("wyl", "emailemail@email.email");
    }

    static void search(HashMap a){
        System.out.println(a.get("byl"));
    }


}