package Bridge_Questão4.Abstracao;

import Bridge_Questão4.Implementacao.ImplementacaoTipo;

public class ListaOrdenada extends AbstracaoLista {
    public ListaOrdenada(ImplementacaoTipo tipoLista) {
        super(tipoLista);
    }

    @Override
    public void adicionar(String s) {
        System.out.println("Adicionando uma lista ordenada");
    }

    @Override
    public void imprimir() {
        System.out.println(tipoLista + " imprimindo uma lista ordenada.");
    }
}
