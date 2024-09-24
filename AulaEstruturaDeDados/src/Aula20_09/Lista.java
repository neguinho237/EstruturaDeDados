package Aula20_09;

public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        
        System.out.println("Tamanho da Lista = " + lista.getTamanho());

        lista.adiciona("Claudio");

        System.out.println(lista);
        System.out.println("Tamanho da Lista =" + lista.getTamanho());
        System.out.println("Inicio da Lista =" + lista.getInicio());
        System.out.println("Fim da Lista =" + lista.getFim());

        lista.adiciona("Camila");

        System.out.println(lista);
        System.out.println("Tamanho da Lista =" + lista.getTamanho());
        System.out.println("Inicio da Lista =" + lista.getInicio());
        System.out.println("Fim da Lista =" + lista.getFim());

    }
}
