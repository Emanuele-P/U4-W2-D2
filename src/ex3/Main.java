package ex3;

public class Main {
    public static void main(String[] args) {

        ContactsClass.addContacts("Cloud", "398457028");
        ContactsClass.addContacts("Tifa", "339475857");
        ContactsClass.addContacts("Barret", "346573892");
        ContactsClass.addContacts("Aerith", "344758569");
        ContactsClass.addContacts("Sephiroth", "347584485");

        System.out.println("Contacts:");
        ContactsClass.printList();
        int contactsNum = ContactsClass.getContacts().size();
        System.out.println("Added " + contactsNum + " new contacts");

        String removed = ContactsClass.removeContactByName("Aerith");
        System.out.println("Sephiroth removed " + (contactsNum - ContactsClass.getContacts().size()) + " contact, " + removed);

        ContactsClass.findContactbyNumber("339475857");

        ContactsClass.findNumberByName("Barret");

    }
}
