
public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addNumber("Ivan", "123456789");
        phoneBook.addNumber("Valentina", "987456321");
        phoneBook.addNumber("Valentina", "369852369");
        phoneBook.addNumber("Ivan", "147852369");
        phoneBook.addNumber("Ivan", "253698741");
        phoneBook.addNumber("Anna", "369852147");

        phoneBook.showSortedPhoneBook();
    }
}