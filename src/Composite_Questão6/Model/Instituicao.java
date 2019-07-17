package Composite_Questão6.Model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao implements IndividuoComposite{
    private String nome;
    private List<IndividuoComposite> membros = new ArrayList<>();

    public Instituicao(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public List<IndividuoComposite> getMembros() {
        return membros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMembros(List<IndividuoComposite> membros) {
        this.membros = membros;
    }

    public void adicionar(IndividuoComposite participante){
        membros.add(participante);
    }

    public void remover(IndividuoComposite participante){
        membros.remove(participante);
    }

    public void imprimir(){
        for(IndividuoComposite membro: membros){
            System.out.println(membro + " - Instituição: " + this.nome);
        }
    }

    @Override
    public String toString() {
        return "Instituição: " + this.nome;
    }
}
