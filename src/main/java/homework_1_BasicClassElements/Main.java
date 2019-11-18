package homework_1_BasicClassElements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {

        Contact ion_ghincolov = new Contact("Ion Ghincolov", 123456789);
        Contact margo_gabureac = new Contact("Margo Gabureac", 313133131);
        Contact sanea_fasii = new Contact("Sanea Fasii", 123464646);
        Contacts contactList = new Contacts();

        System.out.println("****************Add Contacts*************************");
        contactList.addNewContact(ion_ghincolov);
        contactList.addNewContact(margo_gabureac);
        contactList.addNewContact(sanea_fasii);

        System.out.println("***************List Before delete contact ****************");
        contactList.printContactList();

        contactList.deleteContact(ion_ghincolov);
        System.out.println("******************List After delete contact***************");
        contactList.printContactList();

        contactList.updateContactPhoneNumber(margo_gabureac, 22222222);
        System.out.println("*****************List After update*****************");
        contactList.printContactList();
    }
}

