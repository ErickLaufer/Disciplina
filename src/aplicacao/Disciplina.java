package aplicacao;

public class Disciplina {
	    private String codigo;
	    private String nome;
	    private int fase;
	    private int cargaHoraria;

	    public Disciplina(String codigo, String nome, int fase, int cargaHoraria) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.fase = fase;
	        this.cargaHoraria = cargaHoraria;
	    }

	    public int getCargaHoraria() {
	        return cargaHoraria;
	    }

	    @Override
	    public String toString() {
	        return "Disciplina{" +
	                "codigo='" + codigo + '\'' +
	                ", nome='" + nome + '\'' +
	                ", fase=" + fase +
	                ", cargaHoraria=" + cargaHoraria +
	                '}';
	    }
	}


