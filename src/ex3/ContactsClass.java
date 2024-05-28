package ex3;


import java.util.HashMap;
import java.util.Map;

public class ContactsClass {

    private static final Map<String, String> contacts = new HashMap<>();
    private static String name;
    private static String number;


    public ContactsClass(String name, String number) {
        this.name = name;
        this.number = number;
    }


    public static void addContacts(String name, String phone) {
        contacts.put(name, phone);
    }

    public static String removeContactByName(String name) {
        contacts.remove(name);
        return name;
    }

    public static void findContactbyNumber(String phone) {
        String result = "";
        for (String name : contacts.keySet()) {
            if (phone.equals(contacts.get(name))) {
                result = "Searched number: " + name;
            }
        }
        System.out.println(!result.isEmpty() ? result : "Contact not found!");
    }

    public static void findNumberByName(String name) {
        String phone = contacts.get(name);
        System.out.println(phone != null ? "Searched name: " + phone : "Contact not found!");
    }

    public static void printList() {
        for (String name : contacts.keySet()) {
            System.out.println("Name: " + name + ", number: " + contacts.get(name));
        }
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ContactsClass.name = name;
    }

    public static String getNumber() {
        return number;
    }

    public static void setNumber(String number) {
        ContactsClass.number = number;
    }

    public static Map<String, String> getContacts() {
        return contacts;
    }

}
