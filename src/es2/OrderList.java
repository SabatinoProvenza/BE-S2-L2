package es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrderList {

    public static ArrayList<Integer> orderList(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(100) + 1);
        }

        Collections.sort(lista);
        return lista;
    }
}

