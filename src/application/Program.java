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

		System.out.print("Selecione um n�mero correspondente a op��o desejada: ");
		System.out.print("\n1 - Cadastrar aluno\n"
					   + "2 - Listar alunos\n"
					   + "3 - Consultar aluno\n"
					   + "4 - Editar aluno\n"
					   + "5 - Excluir aluno");
					   
		int opcao = sc.nextInt();
		while (opcao >= 1 && opcao <= 5) {
			if (opcao == 1) {

				System.out.print("\nNome: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				sc.nextLine();
				System.out.print("endereco: ");
				String endereco = sc.nextLine();
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				System.out.print("e-mail: ");
				String email = sc.nextLine();
				Aluno aluno = new Aluno(name, idade, endereco, telefone, email);
				list.add(aluno);
				System.out.print("A matr�cula do aluno " + list.get(list.indexOf(aluno)).getName() + " �: " + list.indexOf(aluno) + "\n");
			}
			if (opcao == 2) {
				for (Aluno x : list) {
					System.out.println("\nMatr�cula: " + list.indexOf(x));
					System.out.print(x);
				}
			}
			if (opcao == 3) {
				System.out.print("Digite a matr�cula do aluno a ser consultado: ");
				int consulta = sc.nextInt();
				System.out.println(list.get(consulta));
			}
			if (opcao == 4) {
				System.out.print("Digite a matr�cula do aluno a ser editado: ");
				int edicao = sc.nextInt();
				sc.nextLine();
				list.get(edicao);
				System.out.print("Digite as informa��es de cadastro atualizadas: ");
				System.out.print("\nNome: ");
				String novoNome = sc.nextLine();
				System.out.print("Idade: ");
				int novaIdade = sc.nextInt();
				sc.nextLine();
				System.out.print("Endere�o: ");
				String novoEndereco = sc.nextLine();
				System.out.print("Telefone: ");
				String novoTelefone = sc.nextLine();
				System.out.print("e-mail: ");
				String novoEmail = sc.nextLine();
				Aluno aluno = new Aluno(novoNome, novaIdade, novoEndereco, novoTelefone, novoEmail);
				list.set(edicao, aluno);
					
				
			}
			if (opcao == 5) {
				System.out.print("Digite a aluno a ser exclu�do: ");
				int exclusao = sc.nextInt();
				list.remove(exclusao);
			}
			System.out.print("\nSelecione um n�mero correspondente a op��o desejada: ");
			System.out.print("\n1 - Cadastrar aluno\n"
					   + "2 - Listar alunos\n"
					   + "3 - Consultar aluno\n"
					   + "4 - Editar aluno\n"
					   + "5 - Excluir aluno");
		opcao = sc.nextInt();

		}
		sc.close();
	}

}

/*GLOSS�RIO DE VARI�VEIS
sc = leitura de dados do usu�rio
list = implementa��o da ArrayList
opcao = (int) escolha do item no menu principal
	CADASTRO DO ALUNO 
	name = (String)
	idade = (int)
	endereco = (String)
	telefone = (String)
	email = (String)
consulta = (int) Consulta de aluno espec�fico a partir de sua matr�cula (posi��o na lista)
edi��o = (int) filtro para edi��o de cadastro do aluno
exclus�o = (int) exclus�o de cadastro do aluno*/
