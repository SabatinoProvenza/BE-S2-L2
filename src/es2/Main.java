package es2;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> numeri = OrderList.orderList(5);
        System.out.println("Lista ordinata " + numeri);


        ArrayList<Integer> numeriInversi = ReverseList.reverseList(numeri);
        System.out.println("Lista invertita " + numeriInversi);

        System.out.println("Posizioni pari della prima lista:");
        BooleanList.BooleanList(numeri, true);

        System.out.println("Posizioni dispari della prima lista:");
        BooleanList.BooleanList(numeri, false);
    }


}
