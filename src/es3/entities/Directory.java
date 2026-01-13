package es3.entities;

import java.util.HashMap;

public class Directory {
    public static HashMap<String, Integer> contacts = new HashMap<>();

    public static void addContact(String nome, Integer numero) {
        contacts.put(nome, numero);
    }

    public static void deleteContact(String nome) {
        contacts.remove(nome);
    }

    public static void searchNamePhone(Integer numero) {
        for (String nome : contacts.keySet()) {
            if (numero.equals(contacts.get(nome))) {
                System.out.println(nome);
            }
        }
    }


    public static void searchName(String nome) {
        int numero = contacts.get(nome);
        System.out.println(numero);
    }

    public static void printContacts() {
        for (String nome : contacts.keySet()) {
            System.out.println("Nome: " + nome + ", numero di telefono: " + contacts.get(nome));
        }
    }
}
