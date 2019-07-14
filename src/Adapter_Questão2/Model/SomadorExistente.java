package Adapter_Questão2.Model;

import java.util.List;

public class SomadorExistente {
    public int somaLista(List<Integer> lista){
        int soma = 0;
        for(int i : lista){
            soma += i;
        }
        return soma;
    }
}
