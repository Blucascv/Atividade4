package Atividade4;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		String nome;

		System.out.println("Informe o seu nome: ");
		nome = leitor.nextLine();

		System.out.println("Informe a sua idade: ");
		int idade = leitor.nextInt();

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);

		leitor.close();
	}
}
