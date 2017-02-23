package Atividade4;

import java.util.Scanner;

public class IdadeAtual {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a data do seu nascimento: ");
		int nascimento = leitor.nextInt();
		
		System.out.println("Informe o ano atual: ");
		int anoAtual = leitor.nextInt();
		
		System.out.println("Sua idade: " + (anoAtual - nascimento));
		leitor.close();
	}
}
