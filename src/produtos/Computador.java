package produtos;

public class Computador extends Produto implements Autenticacao {

	@Override
	public boolean autenticaCodigo(Long codigo) {
		return (codigo.equals(codigoDeBarras));
	}

	@Override
	Double calcularPreco(Double valorCompra, Double valorLucro) {
		return valorCompra + (valorCompra * valorLucro);
	}
	
}
