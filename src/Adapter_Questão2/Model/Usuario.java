package Adapter_Questão2.Model;

public class Usuario {
    private SomadorEsperado somador;

    public Usuario(SomadorEsperado somador) {
        this.somador = somador;
    }

    public int somar(){
        int[] vetor = new int[]{
                1, 3, 5, 6, 8, 3, 4, 10
        };
        int soma = somador.soma(vetor);
        return soma;
    }
}
