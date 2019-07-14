package Adapter_Questão1.View;

import Adapter_Questão1.Adaptador.MapAdapter;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        MapAdapter test = new MapAdapter();

        ArrayList<Integer> chaves = new ArrayList();
        ArrayList<Integer> valores = new ArrayList();
        chaves.add(3);
        chaves.add(6);
        chaves.add(9);
        valores.add(2);
        valores.add(8);
        valores.add(32);
        test.put(chaves, valores);

        int[][] matriz = new int[][]{
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
        };

        test.matriz(matriz);
        System.out.println(test);
    }
}
