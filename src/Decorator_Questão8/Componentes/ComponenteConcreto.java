package Decorator_Questão8.Componentes;

public class ComponenteConcreto implements Componente {
    @Override
    public void executarTarefa() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
