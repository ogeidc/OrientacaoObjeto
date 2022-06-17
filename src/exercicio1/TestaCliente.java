package exercicio1;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		String nome, endereco;
		int idade;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o nome do cliente: ");
		nome = in.nextLine();
		System.out.println("Informe a idade do cliente: ");
		idade = in.nextInt();
		System.out.println("Informe o endereço do cliente: ");
		in.nextLine();
		endereco = in.nextLine();
		Cliente1 pessoa1= new Cliente1(nome, idade, endereco);
		pessoa1.mostrar();

	}

}
