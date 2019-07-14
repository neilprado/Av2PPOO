package Bridge_Questão4.Abstracao;

import Bridge_Questão4.Implementacao.ImplementacaoTipo;

public class ListaNaoOrdenada extends AbstracaoLista {

    public ListaNaoOrdenada(ImplementacaoTipo tipoLista) {
        super(tipoLista);
    }

    @Override
    public void adicionar(String s) {
        System.out.println("Adicionando uma lista não ordenada");
    }

    @Override
    public void imprimir() {
        System.out.println(tipoLista + " imprimindo uma lista não ordenada");

    }
}