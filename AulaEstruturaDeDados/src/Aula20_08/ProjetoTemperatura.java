package Aula20_08;

import java.util.Scanner;

public class ProjetoTemperatura {
    public static void main(String[] args) {

		double [] temperatura = new double [7];

		double soma = 0, media = 0;

		int diasAcima = 0, diasAbaixo = 0;

		

		Scanner dados = new Scanner(System.in);

		

		for (int i = 0; i < temperatura.length; i++) {

			System.out.println("Digite a " + (i+1) + "temperatura");

			temperatura [i] = dados.nextDouble();

			soma = soma + temperatura [i];

		}

		

		media = soma /7;

		for (int i =0; i< temperatura.length; i++) {

			if (temperatura[i] > media) {

				diasAcima ++;

			}

			if (temperatura[i] < media) {

				diasAbaixo ++;

			}

		}

		System.out.println(media);

		System.out.println(diasAcima);

		System.out.println(diasAbaixo);

		

		dados.close();

	}
}
