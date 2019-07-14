package Bridge_Questão3.View;

import Bridge_Questão3.Refrigerantes.CocaCola;
import Bridge_Questão3.Refrigerantes.Fanta;
import Bridge_Questão3.Refrigerantes.Guarana;
import Bridge_Questão3.Refrigerantes.Sprite;
import Bridge_Questão3.Tamanhos.TamanhoFamilia;
import Bridge_Questão3.Tamanhos.TamanhoGrande;
import Bridge_Questão3.Tamanhos.TamanhoMedio;
import Bridge_Questão3.Tamanhos.TamanhoPequeno;

public class Client {
    public static void main(String[] args) {
        CocaCola c = new CocaCola();
        Guarana g = new Guarana();
        Fanta f = new Fanta();
        Sprite s = new Sprite();

        TamanhoPequeno t1 = new TamanhoPequeno(c);
        TamanhoMedio t2 = new TamanhoMedio(g);
        TamanhoGrande t3 = new TamanhoGrande(f);
        TamanhoFamilia t4 = new TamanhoFamilia(s);

        t1.beber();
        t2.beber();
        t3.beber();
        t4.beber();

    }
}