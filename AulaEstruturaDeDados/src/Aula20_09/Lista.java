package Aula20_09;

public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        
        System.out.println("Tamanho da Lista = " + lista.getTamanho());

        lista.adiciona("Cladio");

        
    }
}
