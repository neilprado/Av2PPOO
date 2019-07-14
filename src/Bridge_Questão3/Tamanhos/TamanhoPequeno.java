package Bridge_Questão3.Tamanhos;

import Bridge_Questão3.Refrigerantes.ImplementacaoRefrigerante;

public class TamanhoPequeno extends AbstracaoTamanho {

    public TamanhoPequeno(ImplementacaoRefrigerante refrigerante) {
        super(refrigerante);
    }

    @Override
    public void beber() {
        System.out.println("Toma um gole de " + refrigerante);
        System.out.println("Acabou o(a) " + refrigerante);
        System.out.println();
    }
}