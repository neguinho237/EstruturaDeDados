package Aula20_08;

public class Vetor {
    //lista de atributos

	public String [] elementos;

	public int tamanho;

	

	public Vetor (int capacidade) {

		this.elementos = new String [capacidade];

		this.tamanho = 0;

	}

	

	public void adiciona (String elemento) throws Exception{

		if(this.tamanho < this.elementos.length) {

			this.elementos[this.tamanho]=elemento;

			this.tamanho++;

		}else {

			throw new Exception ("O Vetor ja esta cheio,"

					+ "não é possivel adicionar novos elementos");

		}

	}

	

	public int tamanho () {

		return this.tamanho;

	}

	

	//public String toString() {

		//return Arrays.toString(elementos);

	//}

	

	@Override

	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");

		

		for(int i = 0; i<this.tamanho-1; i++ ) {

			s.append(this.elementos);

			s.append(", ");

		}

		

		if(this.tamanho>0) {

			s.append(this.elementos[this.tamanho-1]);

		}

		

		s.append("]");

		return s.toString();	

		}

	

	public String busca (int posicao) throws Exception{

		if(posicao >= 0 && posicao < tamanho) {

			return this.elementos[posicao];

		}else {

			throw new  Exception ("Posicão invalida");

		}

	}

	

	public int busca1 (String elemento) {

		for (int i =0; i < tamanho; i++) {

			if(elementos[i].equals(elemento)) {

				return i;

			}

		}

		return -1;

	}

	

	public boolean adicionaInicio (int posicao, String elemento) throws Exception{

		if(posicao >= 0 && posicao < tamanho) {

			for(int i = this.tamanho-1; i>posicao; i--) {

				this.elementos[i+1] = this.elementos[i];

			}

			this.elementos[posicao] = elemento;

			this.tamanho ++;

		}else {

			throw new Exception("Posicão inválida");

		}

		return true;

	}
}
