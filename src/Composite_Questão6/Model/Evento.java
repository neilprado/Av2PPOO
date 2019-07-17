package Composite_Questão6.Model;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private int quantidadeAssentos;
    private List<IndividuoComposite> participantes = new ArrayList<>();

    public Evento(String nome, int quantidadeAssentos) {
        this.nome = nome;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    public int getParticipantes() {
        int total = 0;
        for(IndividuoComposite participante : participantes){
            if(participante instanceof Individuo){
                total++;
            }else if(participante instanceof Instituicao){
                Instituicao instituicao = (Instituicao) participante;
                total += instituicao.getMembros().size();
            }
        }
        return total;
    }

    public void adicionar(IndividuoComposite participante) throws Exception {
        if(participante instanceof Individuo){
            if(quantidadeAssentos > participantes.size()){
                participantes.add(participante);
            }else {
                throw new Exception("Não existem mais assentos disponíveis");
            } if(participante instanceof Instituicao){
                Instituicao instituicao = (Instituicao) participante;

                if(quantidadeAssentos > participantes.size() + instituicao.getMembros().size()){
                    participantes.add(participante);
                }else {
                    throw new Exception("Evento não possui mais assentos disponíveis, sinto muito");
                }
            }
        }
    }

    public void imprimir(){
        System.out.println("-------------");
        for (IndividuoComposite participante: participantes){
            if(participante instanceof Individuo){
                System.out.println("Participante " + participante + " Instituição: Sem instituição cadastrada");
            }else if (participante instanceof Instituicao){
                Instituicao instituicao = (Instituicao) participante;
                instituicao.imprimir();
            }
        }
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", quantidadeAssentos=" + quantidadeAssentos +
                ", total de participantes=" + getParticipantes() +
                '}';
    }
}
