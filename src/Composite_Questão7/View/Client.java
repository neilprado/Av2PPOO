package Composite_Questão7.View;

import Composite_Questão7.Model.Celula;
import Composite_Questão7.Model.Linha;
import Composite_Questão7.Model.Tabela;

public class Client {
    public static void main(String[] args) {
        Celula c1 = new Celula("Pipipopopopo pipipipopopo");
        Celula c2 = new Celula("Rompompompom Man Down");
        Celula c3 = new Celula("mimimimimimimimimimimi");
        Celula c4 = new Celula("The Muppets, Ode to Joy");

        Linha l1 = new Linha();
        l1.adicionar(c1);
        l1.adicionar(c1);
        l1.adicionar(c2);
        l1.adicionar(c2);

        Linha l2 = new Linha();
        l2.adicionar(c3);
        l2.adicionar(c4);
        l2.adicionar(c3);
        l2.adicionar(c4);

        Tabela t = new Tabela();
        t.adicionar(l1);
        t.adicionar(l2);
        t.imprimir();
    }
}
