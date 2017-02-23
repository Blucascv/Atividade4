package Atividade4;

import java.util.Scanner;

public class Somar {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o primeiro numero:");
		int n1 = leitor.nextInt();
		
		System.out.println("Informe o segundo numero:");
		int n2 = leitor.nextInt();
		
		System.out.println("Resultado:" + (n1+n2));
		
		leitor.close();
	}
}
