
import java.util.Locale;
import java.util.Scanner;


public class Ex1 {
	public static void main(String[] args) {

		/*
		 * Fazer um programa pra ler um número inteiro N e a altura de N pessoas.
		 * Armazena as N alturas em um vetor. Em seguida, mostrar a altura média das
		 * pessoas.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("n: ");
		int n = sc.nextInt();

		double[] altura = new double[n];

		for (int i = 0; i < altura.length; i++) {
			System.out.print("altura " + i + ": ");
			altura[i] = sc.nextDouble();
		}
		double media = mediaAltura(altura);
		System.out.printf("Média de altura de pessoas no vetor é: %.2f", media);

		sc.close();
	}

	public static double mediaAltura(double altura[]) {
		double media = 0;
		for (int i = 0; i < altura.length; i++) {
			media += altura[i];
		}
		return media / altura.length;
	}
}