package Composite_Questão6.View;

import Composite_Questão6.Model.Evento;
import Composite_Questão6.Model.Individuo;
import Composite_Questão6.Model.IndividuoComposite;

public class Client {
    public static void main(String[] args) {
        Evento iftech = new Evento("IF Tech", 10);
        IndividuoComposite individuo1 = new Individuo("Alana Morais", 1);
        IndividuoComposite individuo2 = new Individuo("Valeria Cavalcanti", 2);

        try {
            iftech.adicionar(individuo1);
            iftech.adicionar(individuo2);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
