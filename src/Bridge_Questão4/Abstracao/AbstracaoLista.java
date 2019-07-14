package Bridge_Questão4.Abstracao;

import Bridge_Questão4.Implementacao.ImplementacaoTipo;

public abstract class AbstracaoLista {

    protected ImplementacaoTipo tipoLista;

    public AbstracaoLista(ImplementacaoTipo tipoLista){
        this.tipoLista = tipoLista;
    }

    public abstract void adicionar(String s);
    public abstract void imprimir();
}
