//14. **Телефонная книга (Contact и PhoneBook):
//        - Contact:
//        - Поля: name (String), phoneNumber (String).
//        - PhoneBook:
//        - Поля: contacts (List<Contact>).
//        - Методы:
//        - addContact(Contact contact): добавляет контакт.
//        - findContact(String name): ищет контакт по имени.
//        - Дополнительно: Реализуйте удаление и редактирование контактов.

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();
    private List<String> phoneNumbers = new ArrayList<>();

    public void addContact(Contact contact) {
        if(!phoneNumbers.contains(contact.getName())) {
            contacts.add(contact);
            phoneNumbers.add(contact.getName());
            System.out.println("New contact: " + contact.getName());
        } else {
            System.out.println(contact.getName() + " is already added.");
        }
    }

    public Contact findContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(name + " " +contact.getPhoneNumber() + " just have found.");
                return contact;
            }
        }
        System.out.println(name + " employee not found.");
        return null;
    }

    public void deleteContact(Contact contact) {
        if(phoneNumbers.contains(contact.getName())) {
            contacts.remove(contact.getName());
            phoneNumbers.remove(contact.getName());
            System.out.println(contact.getName() + " employee deleted.");
        } else {
            System.out.println(contact.getName() + " employee not found.");
        }
    }

    public boolean editContact(String name, String newName, String newPhoneNumber) {
        Contact contact = findContact(name);
        if (contact != null) {
            contact.setName(newName);
            contact.setPhoneNumber(newPhoneNumber);
            System.out.println("Contact " + name + " edited.");
            return true;
        }
        return false;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
