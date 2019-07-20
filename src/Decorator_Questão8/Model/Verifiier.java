package Decorator_Questão8.Model;

import Decorator_Questão8.Componentes.Componente;

import java.util.Calendar;

public class Verifiier extends Interceptador {
    public Verifiier(Componente componente) {
        super(componente);
    }

    @Override
    public void executarTarefa() {
        Calendar data = Calendar.getInstance();
        int minutos = data.get(data.MINUTE);
        if(minutos % 2 == 0){
            System.out.println("Execução interrompida por estar em um minuto par, " + minutos);
            System.exit(1);
        }
        this.getComponente().executarTarefa();
    }
}
