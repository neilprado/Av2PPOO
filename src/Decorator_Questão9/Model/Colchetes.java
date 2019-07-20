package Decorator_Questão9.Model;

public class Colchetes extends Decorator {
    public Colchetes(Componente componente) {
        super(componente);
    }

    @Override
    public void imprimir() {
        System.out.print("{");
        this.componente.imprimir();
        System.out.print("}");
    }
}
