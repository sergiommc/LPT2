package Controle;
import Academico.*;
import javax.swing.*;

import java.util.ArrayList;

public class ControleAcademico {
	private ArrayList<Disciplina> listaDisciplina = new ArrayList <Disciplina>(); 
	private String disciplinasCadastradas;
	
	public void setAdicionarDisciplina(Disciplina disc){
		listaDisciplina.add(disc);
	}
	public void setAdicionarAlunoDisciplina(int cod_disciplina, Aluno aluno){
		boolean foiEcontrada=false;
		if (listaDisciplina.isEmpty()){
			JOptionPane.showMessageDialog(null,"Disciplina não ecntrondadsaiodhsaudhaudas");
		}
	}
}
