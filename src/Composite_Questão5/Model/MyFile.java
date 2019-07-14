package Composite_Questão5.Model;

public class MyFile extends File {
    protected String size;

    public MyFile(String nome, String size) {
        this.nome = nome;
        this.size = size;
    }

    @Override
    public void getNome() {
        System.out.println(this.nome +" tem " + this.size + " Bytes");
    }
}
