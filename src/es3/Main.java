package es3;

import static es3.entities.Directory.*;


public class Main {
    static void main() {

        addContact("Mario", 3315555);
        addContact("Luigi", 3333030);
        System.out.println(contacts);

        deleteContact("Luigi");
        System.out.println(contacts);

        addContact("Gianni", 3332010);

        searchNamePhone(3332010);
        System.out.println(contacts);

        searchName("Gianni");

        addContact("Flavio", 1234567);

        printContacts();

    }

}
