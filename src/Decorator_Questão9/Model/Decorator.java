package Decorator_Questão9.Model;

public abstract class Decorator implements Componente {
    public Componente componente;

    public Decorator(Componente componente) {
        this.componente = componente;
    }

    public Componente getComponente() {
        return componente;
    }
}
