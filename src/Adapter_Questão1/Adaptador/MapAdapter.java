package Adapter_Questão1.Adaptador;

import java.util.ArrayList;
import java.util.HashMap;

public class MapAdapter extends HashMap {

    public MapAdapter(){
        super();
    }

    public void lista(ArrayList<Integer> chaves, ArrayList<Integer> valores){
        for (int i = 0; i < chaves.size(); i++){
            super.put(chaves.get(i), valores.get(i));
        }
    }

    public void matriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                super.put(matriz[i], matriz[j]);
            }
        }
    }
}
