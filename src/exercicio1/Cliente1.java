package exercicio1;

public class Cliente1 {
	private String nome;
	private int idade;
	private String endereco;
	
public void mostrar() {
	System.out.println("Nome do cliente: "+this.nome);
	System.out.println("\nIdade: "+this.idade);
	System.out.println("\nEndereço: "+this.endereco);
	
}
public Cliente1(String nome, int idade, String endereco) {
	this.nome = nome;
	this.idade = idade;
	this.endereco = endereco;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
} 

}
