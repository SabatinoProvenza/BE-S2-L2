package es2;

import java.util.ArrayList;

public class BooleanList {

    public static void BooleanList(ArrayList<Integer> lista, boolean booleano) {
        for (int i = 0; i < lista.size(); i++) {

            if (booleano && i % 2 == 0) {
                System.out.println(lista.get(i));
            }

            if (!booleano && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }
}
