package Decorator_Questão8.Model;

import Decorator_Questão8.Componentes.Componente;

public class Interceptador implements Componente {
    private Componente componente;

    public Interceptador(Componente componente) {
        this.componente = componente;
    }

    public Componente getComponente() {
        return componente;
    }

    @Override
    public void executarTarefa() {
        long antes = System.currentTimeMillis();
        componente.executarTarefa();
        long depois = System.currentTimeMillis();
        System.out.println(depois - antes + "ms de intervalo");
    }
}
