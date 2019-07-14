package Bridge_Questão4.View;

import Bridge_Questão4.Abstracao.AbstracaoLista;
import Bridge_Questão4.Abstracao.ListaNaoOrdenada;
import Bridge_Questão4.Abstracao.ListaOrdenada;
import Bridge_Questão4.Implementacao.Letras;
import Bridge_Questão4.Implementacao.Marcadores;
import Bridge_Questão4.Implementacao.Numeros;

public class Client {
    public static void main(String[] args) {
        Letras l1 = new Letras();
        Marcadores m1 = new Marcadores();
        Numeros n1 = new Numeros();

        AbstracaoLista a1 = new ListaNaoOrdenada(l1);
        AbstracaoLista a2 = new ListaOrdenada(m1);
        AbstracaoLista a3 = new ListaOrdenada(n1);

        a1.adicionar("Adicionando");
        a1.imprimir();
    }
}
