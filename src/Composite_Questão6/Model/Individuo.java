package Composite_Questão6.Model;

public class Individuo implements IndividuoComposite{
    private String nome;

    private int assento;

    public Individuo(String nome, int assento) {
        this.nome = nome;
        this.assento = assento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    @Override
    public String toString() {
        return "Individuo{" +
                "nome='" + nome + '\'' +
                ", assento=" + assento +
                '}';
    }
}
