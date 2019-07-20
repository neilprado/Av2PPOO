package Composite_Questão7.Model;

import java.util.ArrayList;
import java.util.List;

public class Linha implements Componente {
    private List<Celula> celulas = new ArrayList<>();

    public void imprimir() {
        for (Celula celula : this.celulas)
            celula.imprimir();
        //Imprime a borda lateral
        System.out.println(" |");
        //Imprime a linha
        int tamanho = (this.celulas.size() * 17) + 5;
        char[] linha = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            linha[i] = '-';
        }
        System.out.println(" " + new String(linha));
    }

    public void adicionar(Celula c) {
        celulas.add(c);
    }
}