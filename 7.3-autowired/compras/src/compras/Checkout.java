package compras;

public class Checkout {

	private Impressora impressora;
	
	public Checkout(Impressora impressora) {
		this.impressora = impressora;
	}
	
	public void finalizar() {
		//regras do checkout
		impressora.imprimir("compras10.csv");
	}
}
