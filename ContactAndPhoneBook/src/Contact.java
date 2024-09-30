//14. **Телефонная книга (Contact и PhoneBook):
//        - Contact:
//        - Поля: name (String), phoneNumber (String).
//        - PhoneBook:
//        - Поля: contacts (List<Contact>).
//        - Методы:
//        - addContact(Contact contact): добавляет контакт.
//        - findContact(String name): ищет контакт по имени.
//        - Дополнительно: Реализуйте удаление и редактирование контактов.

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact (String name, String phoneNumber){
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return name + " " + phoneNumber;
    }
}
