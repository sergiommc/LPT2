import java.util.*;
import javax.swing.*;

public class Empresa {
	ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

	public static void main(String[] args) {
		Empresa emp = new Empresa();
		int opcao = Integer
				.parseInt(JOptionPane
						.showInputDialog("Hello guy, qual opção? \n 1 - Localizar \n 2 - Remover \n 3 - Fazer nada \n 5 - tchau, não tem 4 :D"));
		while (opcao != 5) {
			if (opcao == 1) {

				String nome = JOptionPane
						.showInputDialog("Qual nome do brother????");
				int matricula = Integer
						.parseInt(JOptionPane
								.showInputDialog("Qual a matricula do brother????? me responda, seu negro!"));
				emp.adicionarFuncionario(nome, matricula);

			}
		}
	}

	public void adicionarFuncionario(String nome, int matricula) {
		Funcionario func = new Funcionario();
		func.setNome(nome);
		func.setMatricula(matricula);
		lista.add(func);
	}
}
