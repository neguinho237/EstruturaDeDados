package Aula20_08;

public class TesteVetor {
    public static void main(String[] args) throws Exception {

		Vetor v1 = new Vetor (5);

		

		v1.adiciona("elemento 1");

		

	 System.out.println("A quantidade de informações no vetor é:" + v1.tamanho()); 

	 System.out.println("Dados do vetor: " + v1.toString());

	 System.out.println("Informe a posição 1" + v1.busca(3));

	 

	 

	 v1.adicionaInicio(0, "Elemento 0");

	 System.out.println("A quantidade de informações no vetor é:" + v1.tamanho);

	 System.out.println("Dados do Vetor:" + v1.toString());

	 System.out.println("Informação na posição 1" + v1.busca(0));

	 }
}
