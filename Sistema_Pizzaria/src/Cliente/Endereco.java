package Cliente;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	
	
	private Endereco() {}
	
	public static Endereco Build() {
		return new Endereco();
	}
	
	
	public String getRua() {
		return rua;
	}
	
	public Endereco setRua(String rua) {
		this.rua = rua;
		return this;
	}
	
	public int getNumero() {
		return numero;
	}

	public Endereco setNumero(int numero) {
		this.numero = numero;
		return this;
	}

	public String getBairro() {
		return bairro;
	}

	public Endereco setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public String getCidade() {
		return cidade;
	}
	
	public Endereco setCidade(String cidade) {
		this.cidade = cidade;
		return this;
	}
	
	public String getEnderecoCompleto() {
		return rua + " " + numero + " " + bairro + " " + cidade;
	}

	
}
