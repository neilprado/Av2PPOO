package Decorator_Questão8.Model;

import Decorator_Questão8.Componentes.Componente;

public class Cronometro extends Interceptador {
    public Cronometro(Componente componente) {
        super(componente);
    }

    @Override
    public void executarTarefa() {
        for (int i = 0; i<10; i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        this.getComponente().executarTarefa();
    }
}
