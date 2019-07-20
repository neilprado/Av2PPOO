package Composite_Questão7.Model;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements Componente {
    private List<Linha> linhas = new ArrayList<>();

    public void adicionar(Linha l) {
        linhas.add(l);
    }

    @Override
    public void imprimir() {
        for (Linha linha : this.linhas) {
            linha.imprimir();
        }
    }

}
