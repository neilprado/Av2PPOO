package Decorator_Questão9.Model;

public class Parenteses extends Decorator {


    public Parenteses(Componente componente) {
        super(componente);
    }

    @Override
    public void imprimir() {
        System.out.print("(");
        this.componente.imprimir();
        System.out.print(")");
    }
}
