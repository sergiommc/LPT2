LPT2
====

AULAS

public class Aluno {
	private String nome;
	private int matricula;
	public Aluno (String n, int m){
		nome = n;
		matricula = m;
		
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
