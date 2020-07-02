package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Aluno> list = new ArrayList<>();

		System.out.println("Bem vindo ao Sistema FourFit Academia!\nSelecione um n�mero correspondente a op��o desejada: ");
		System.out.print("1 - Cadastrar aluno\n"
					   + "2 - Listar alunos\n"
					   + "3 - Consultar aluno\n"
					   + "4 - Editar aluno\n"
					   + "5 - Excluir aluno\n"
					   + "6 - Finalizar aplica��o\n");
		int opcao = sc.nextInt();
		while (opcao != 6) {
			if (opcao == 1) {

				System.out.print("Nome: ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				sc.nextLine();
				System.out.print("endereco: ");
				String endereco = sc.nextLine();
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				System.out.print("E-mail: ");
				String email = sc.nextLine();
				Aluno aluno = new Aluno(name, idade, endereco, telefone, email);
				list.add(aluno);
				System.out.print("A matr�cula do aluno " + aluno.getName() + " �: " + list.indexOf(aluno) + "\n");
			}
			if (opcao == 2) {
				for (Aluno x : list) {
					System.out.println("Matr�cula: " + list.indexOf(x));
					System.out.print(x);
				}
			}
			if (opcao == 3) {
				System.out.print("Digite a matr�cula do aluno a ser consultado: ");
				int consulta = sc.nextInt();
				list.get(consulta);
			}
			if (opcao == 4) {
				System.out.print("Digite a matr�cula do aluno a ser editado: ");
				int edicao = sc.nextInt();
				list.get(edicao);
				System.out.print("Digite as informa��es de cadastro atualizadas: ");
			}
			if (opcao == 5) {
				System.out.print("Digite a aluno a ser exclu�do: ");
				int exclusao = sc.nextInt();
				list.remove(exclusao);
			}
			System.out.println("\nBem vindo ao Sistema FourFit Academia!\nSelecione um n�mero correspondente a op��o desejada: ");
			System.out.print("1 - Cadastrar aluno\n"
					   + "2 - Listar alunos\n"
					   + "3 - Consultar aluno\n"
					   + "4 - Editar aluno\n"
					   + "5 - Excluir aluno\n"
					   + "6 - Finalizar aplica��o\n");
		opcao = sc.nextInt();

		}
		sc.close();
	}

}
