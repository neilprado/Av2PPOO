package Bridge_Questão3.Tamanhos;

import Bridge_Questão3.Refrigerantes.ImplementacaoRefrigerante;

public abstract class AbstracaoTamanho {
    protected ImplementacaoRefrigerante refrigerante;

    public AbstracaoTamanho (ImplementacaoRefrigerante refrigerante){
        this.refrigerante = refrigerante;
    }

    public abstract void beber();
}
