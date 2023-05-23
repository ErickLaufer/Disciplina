package entidades;

import java.util.ArrayList;
import java.util.List;

import aplicacao.Disciplina;

public class Professor {
	    private String codigo;
	    private String nome;
	    
	    private List<Disciplina> disciplinas;

	    public Professor(String codigo, String nome) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.disciplinas = new ArrayList<>();
	    }

	    public void adicionarDisciplina(Disciplina disciplina) {
	        disciplinas.add(disciplina);
	    }

	    public int somaCarga() {
	        int totalCargaHoraria = 0;
	        for (Disciplina disciplina : disciplinas) {
	            totalCargaHoraria += disciplina.getCargaHoraria();
	        }
	        return totalCargaHoraria;
	    }

	    @Override
	    public String toString() {
	        return "Professor{" +
	                "codigo='" + codigo + '\'' +
	                ", nome='" + nome + '\'' +
	                ", disciplinas=" + disciplinas +
	                '}';
	    }
	}
