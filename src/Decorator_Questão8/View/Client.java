package Decorator_Questão8.View;

import Decorator_Questão8.Componentes.ComponenteConcreto;
import Decorator_Questão8.Model.Cronometro;
import Decorator_Questão8.Model.Interceptador;
import Decorator_Questão8.Model.Log;
import Decorator_Questão8.Model.Verifiier;

public class Client {
    public static void main(String[] args) {
        new Interceptador(new Log(new Verifiier(new Cronometro(new ComponenteConcreto())))).executarTarefa();
    }
}
