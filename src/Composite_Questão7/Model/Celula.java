package Composite_Questão7.Model;

public class Celula implements Componente {
    private String content;

    public Celula(String content) {
        this.content = content;
    }

    @Override
    public void imprimir() {
        this.content = content + " ";
        content = content.substring(0, 15);
        System.out.print(" | " + content);
    }
}
