package es2;

import java.util.ArrayList;

public class ReverseList {
    public static ArrayList<Integer> reverseList(ArrayList<Integer> lista) {
        ArrayList<Integer> reverseList = new ArrayList<>(lista);

        for (int i = lista.size() - 1; i >= 0; i--) {
            reverseList.add(lista.get(i));
        }
        return reverseList;
    }
}
