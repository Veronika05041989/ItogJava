public class Main {


    public static void main(String[] args) {
  
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Veronika", "89189724000");
        phoneBook.addContact("Roman", "89296633033");
        phoneBook.addContact("Milana", "89181095100");
        phoneBook.addContact("Anastasia", "89186561116");
        phoneBook.addContact("Alexey", "89189024230");
        phoneBook.addContact("Mihail", "89182309990");
        phoneBook.addContact("Ivan", "89183045677");
        phoneBook.addContact("Maria", "89112556620");
  
        phoneBook.sortPhoneBook();
        phoneBook.deleteContact("Veronika");
        phoneBook.sortPhoneBook();
        phoneBook.deleteAll();
        phoneBook.sortPhoneBook();
  
    }
    
  }
