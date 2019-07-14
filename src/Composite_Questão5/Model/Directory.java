package Composite_Questão5.Model;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    protected List<File> arquivos = new ArrayList();

    public Directory(String nome) {
        this.nome = nome;
    }

    public void adicionar(File file){
        this.arquivos.add(file);
    }

    @Override
    public void getNome() {
        System.out.println("A pasta "+ this.nome + " tem" + arquivos.size()+ " itens");
    }
}
