//14. **Телефонная книга (Contact и PhoneBook):
//        - Contact:
//        - Поля: name (String), phoneNumber (String).
//        - PhoneBook:
//        - Поля: contacts (List<Contact>).
//        - Методы:
//        - addContact(Contact contact): добавляет контакт.
//        - findContact(String name): ищет контакт по имени.
//        - Дополнительно: Реализуйте удаление и редактирование контактов.


public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Ivan", "123");
        Contact contact2 = new Contact("Madina", "777");
        Contact contact3 = new Contact("Sanam", "456");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        phoneBook.addContact(contact3);

        phoneBook.findContact("Ivan");
        phoneBook.findContact("Madina");
        phoneBook.findContact("Sanam");

        phoneBook.addContact(contact1);
        phoneBook.findContact("Name");

        phoneBook.deleteContact(contact1);
        phoneBook.deleteContact(contact1);

        phoneBook.editContact("Sanam", "Name2", "1234567");
        phoneBook.findContact("Name2");
    }
}