package Aula20_09;

public class No  <Tipo> {
    private Tipo elemento;
    private No<Tipo> proximo;
    
    public No (Tipo elemento){
        this.elemento = elemento;
        this.proximo = null;
    }
}
