package Decorator_Questão9.View;

import Decorator_Questão9.Model.Colchetes;
import Decorator_Questão9.Model.Parenteses;
import Decorator_Questão9.Model.Um;

public class Client {
    public static void main(String[] args) {
        new Parenteses(new Colchetes(new Um())).imprimir();
        System.out.println(" ");
        new Colchetes(new Um()).imprimir();
    }
}
