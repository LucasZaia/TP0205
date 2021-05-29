package Cliente;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}

	public Cliente setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public Cliente setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		return this;
	}

	public String getCpf() {
		return cpf;
	}

	public Cliente setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Cliente setEndereco(Endereco endereco) {
		this.endereco = endereco;
		return this;
	}
	
	private Cliente() {}
	
	public static Cliente Build() {
		return new Cliente();
	}
	
	
}
