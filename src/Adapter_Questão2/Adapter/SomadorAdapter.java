package Adapter_Questão2.Adapter;

import Adapter_Questão2.Model.SomadorEsperado;
import Adapter_Questão2.Model.SomadorExistente;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {
    private SomadorExistente somador = new SomadorExistente();
    private List<Integer> listaSomador = new ArrayList<Integer>();



    @Override
    public int soma(int[] lista) {
        for (int i: lista){
            this.listaSomador.add(i);
        }
        return somador.somaLista(listaSomador);
    }
}
