LPT2
====

AULAS
package Academico;


import Academico.*;

import java.util.*;

import javax.swing.JOptionPane;

public class Disciplina {
	private int codigo;
	private String alunosCadastrados;
	private String assunto;
	private ArrayList<Aluno> ListaAluno = new ArrayList<Aluno>();

	Disciplina(int cod, String ass) {
		this.setCodigo(cod);
		this.setAssunto(ass);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public void adicionarAluno(String nome, int matricula) {
		ListaAluno.add(new Aluno(nome, matricula));

	}

	public void removerAluno(int matricula) {
		boolean foiremovido = false;
		if (ListaAluno.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Não há alunos matriculados, brother");

		} else {
			for (int i = 0; i < ListaAluno.size(); i++) {
				Aluno aluno = (Aluno) ListaAluno.get(i);
				int mat = aluno.getMatricula();
				if (matricula == mat) {

					JOptionPane.showMessageDialog(null,
							"O aluno : " + aluno.getNome() + " foi removido");

					ListaAluno.remove(i);
					foiremovido = true;
				}
			}
			if (!foiremovido) {
				JOptionPane.showMessageDialog(null,
						"Não foi localizado o aluno a ser removido");
			}
		}
	}
		public String getListaAlunosDisciplina(){
			if (ListaAluno.isEmpty()){
				return "Não há alunos matriculados na disciplina, brother";
			}
			else {
				for (int i = 0; i <ListaAluno.size();i++){
					
					alunosCadastrados = alunosCadastrados + ListaAluno.get(i).getNome() +"\n";
				}
				return alunosCadastrados;
			}
		}
}
