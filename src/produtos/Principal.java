package produtos;

public class Principal {

	public static void main(String[] args) {
		Computador computador = new Computador();
		
		System.out.println(computador.autenticaCodigo(11111111111l));
		
		System.out.println(computador.calcularPreco(100.00, 0.35));
	}

}
