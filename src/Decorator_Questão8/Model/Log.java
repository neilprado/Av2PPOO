package Decorator_Questão8.Model;

import Decorator_Questão8.Componentes.Componente;

import java.util.Date;

public class Log extends Interceptador {
    public Log(Componente componente) {
        super(componente);
    }

    @Override
    public void executarTarefa() {
        Date data = new Date();
        System.out.println(data.toString() + "Log!!");
        this.getComponente().executarTarefa();
    }
}
