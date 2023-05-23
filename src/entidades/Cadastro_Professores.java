package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacao.Disciplina;

public class Cadastro_Professores {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o número de professores: ");
	        int numProfessores = scanner.nextInt();
	        scanner.nextLine(); 
	        
	        List<Professor> professores = new ArrayList<>();
	        
	        for (int i = 0; i < numProfessores; i++) {
	            System.out.println("\nProfessor " +  (i + 1) + ":");
	            System.out.print("Código do professor: ");
	            String codigo = scanner.nextLine();
	            System.out.print("Nome do professor: ");
	            String nome = scanner.nextLine();
	            
	            Professor professor = new Professor(codigo, nome);
	            
	            System.out.print("Digite o número de disciplinas do professor: ");
	            int numDisciplinas = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            for (int j = 0; j < numDisciplinas; j++) {
	                System.out.println("\nDisciplina " + (j + 1) + ":");
	                System.out.print("Código da disciplina: ");
	                String codigoDisciplina = scanner.nextLine();
	                System.out.print("Nome da disciplina: ");
	                String nomeDisciplina = scanner.nextLine();
	                System.out.print("Fase da disciplina: ");
	                int faseDisciplina = scanner.nextInt();
	                System.out.print("Carga horária da disciplina: ");
	                int cargaHorariaDisciplina = scanner.nextInt();
	                scanner.nextLine();

	                Disciplina disciplina = new Disciplina(codigoDisciplina, nomeDisciplina, faseDisciplina, cargaHorariaDisciplina);
	                professor.adicionarDisciplina(disciplina);
	            }

	            professores.add(professor);
	        }

	        System.out.println("\nListagem dos professores:");
	        for (Professor professor : professores) {
	            System.out.println(professor);
	            System.out.println("Carga horária total: " + professor.somaCarga() + " horas");
	            System.out.println();
	        }
	        scanner.close();
	    }
	  }
