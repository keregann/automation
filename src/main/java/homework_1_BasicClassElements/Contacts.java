package homework_1_BasicClassElements;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private List<Contact> contactList;

    public Contacts() {
        this.contactList = new ArrayList<>();
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    //add new contact to contact list
    public void addNewContact(Contact contact) {
        contactList.add(contact);
    }


    //delete contact from contacts list
    public void deleteContact(Contact contact) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).equals(contact)) {
                contactList.remove(contactList.get(i));
                break;
            }
        }
    }

    public void updateContactPhoneNumber(Contact contact, int newPhoneNumber) {

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).equals(contact)) {
                contactList.get(i).setPhoneNumber(newPhoneNumber);
                break;
            }
        }
    }

    public void updateContactName(Contact contact, String newName) {

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).equals(contact)) {
                contactList.get(i).setName(newName);
                break;
            }
        }
    }

    //print full contacts list elements
    public void printContactList() {
        for (Contact contact : contactList) {
            System.out.println(contact.toString());
        }
    }
}
