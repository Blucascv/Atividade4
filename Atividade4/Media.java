package Atividade4;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float n1, n2, n3, media;

		System.out.println("Informe a primeira nota: ");
		n1 = leitor.nextInt();

		System.out.println("Informe a segunda nota: ");
		n2 = leitor.nextInt();

		System.out.println("Informe a terceira nota: ");
		n3 = leitor.nextInt();

		if (n1 > n2) {
			media = (n1 + n3) / 2;
		} else {
			media = (n2 + n3) / 2;
		}

		if (media >= 7) {
			System.out.println("nota: " + media + " Aprovado!");
		}
		if ((media >= 5) & (media < 7)) {
			System.out.println("nota: " + media + " Recuperacao!");
		}
		if (media < 5) {
			System.out.println("nota: " + media + " Reprovado!");
		}

		leitor.close();
	}
}
