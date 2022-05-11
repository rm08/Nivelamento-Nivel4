package produtos;

abstract class Produto {

	public Double preco;
	public int quantidade;
	public Long codigoDeBarras;

	abstract Double calcularPreco(Double valorCompra, Double valorLucro);

}
