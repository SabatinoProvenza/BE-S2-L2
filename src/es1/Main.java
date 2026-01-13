package es1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> paroleDistinte = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();
        HashSet<String> listaParole = new HashSet<>();

        int numeroInserito;

        while (true) {
            System.out.println("Inserisci un numero intero");
            try {
                numeroInserito = Integer.parseInt(scanner.nextLine());
                break;
                
            } catch (NumberFormatException e) {
                System.out.println("Numero inserito non corretto");
            }
        }


        for (int i = 0; i < numeroInserito; i++) {
            System.out.println("Inserisci la parola");
            String parola = scanner.nextLine();

            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }

        }

        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero parole distinte: " + paroleDistinte.size());
        System.out.println("Elenco parole distinte: " + paroleDistinte);
    }


}


