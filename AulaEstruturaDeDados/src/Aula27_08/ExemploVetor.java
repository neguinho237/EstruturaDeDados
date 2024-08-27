package Aula27_08;

import java.util.ArrayList;

public class ExemploVetor {
    public static void main(String[] args) {
        ArrayList<String> vetor = new ArrayList<String>();

        vetor.add("Claudio");
        vetor.add("Miguel");
        vetor.add("Ana");
        vetor.add("Pedro");
        vetor.add("Carlos");
        vetor.add("Ana");
        vetor.add("Ze");
        // vetor.remove("Ana");

        System.out.println("A quantidade de informaçãoes no vetor " + vetor.size());

        System.out.println("Dados do vetor: " + vetor.toString());

        vetor.remove("Ana");

        System.out.println("A quantidade de informaçãoes no vetor " + vetor.size());

        System.out.println("Dados do vetor: " + vetor.toString());


    }
}
