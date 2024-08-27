package Aula27_08;

public class TesteObjeto {
    public static void main(String[] args) throws Exception {
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("ana","45513613", "perera@gmail.com");
        Contato c2 = new Contato("joao", "64284524" , "gusta@outlook.com");
        Contato c3 = new Contato("carloss", "125478254", "matatdos@canaab");
        

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Quantidade de dados do vetor: " + vetor.tamanho);
        System.out.println("Dados do Vetor: " + vetor.toString());
    }
}
