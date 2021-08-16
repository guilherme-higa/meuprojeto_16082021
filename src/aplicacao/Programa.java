package aplicacao;

import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;
import entities.Empregrados;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Empregrados> lista = new ArrayList<>();
		Locale.setDefault(Locale.US);

		// capturando número de registros de empregados
		System.out.println("\n\nDigite o número de empregados que deseja registrar : ");
		int num = sc.nextInt();

		// realizando cadastro de informacoes
		for (int i = 0; i < num; i++) {

			System.out.println("Empregado #" + (i + 1) + ":");
			System.out.println("id : ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome : ");
			String nome = sc.nextLine();
			System.out.println("Salário : ");
			double salario = sc.nextDouble();

			Empregrados emp = new Empregrados(id, nome, salario);
			lista.add(emp);
		}

		// buscando id do funcionario p/ realizar aumento salarial
		System.out.println("\n\nDigite o id do funcionario que deseja realizar o aumento de salario : ");
		int id_procura = sc.nextInt();
		Integer pos = posicao(lista, id_procura);

		// realizando aumento de salario
		if (pos != null) {
			System.out.println("Entre com a porcentagem referente ao aumento salarial : ");
			double aumento = sc.nextDouble();
			lista.get(pos).aumentoSalario(aumento);
		} else {
			System.out.println("Esse id não existe");
		}
		
		System.out.println();
		// realizando impressão de valores
		System.out.println("Lista de empregados : ");
		for (Empregrados emp : lista) {
			System.out.println(emp);
		}

		sc.close();
	}

	public static Integer posicao(List<Empregrados> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
