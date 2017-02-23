package Atividade4;

import java.util.Scanner;

public class ConsumoCarro {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float distancia, combustivel;
		
		System.out.println("Distancia total percorrida(Km): ");
		distancia=leitor.nextFloat();
		
		System.out.println("Combutivel gasto(L): ");
		combustivel=leitor.nextFloat();
		
		System.out.println("Custo total do consumo(Km/L): " + (distancia/combustivel));
		
		leitor.close();
	}
}
